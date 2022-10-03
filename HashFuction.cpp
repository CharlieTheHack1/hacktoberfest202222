#include <iostream>
using namespace std;

const int MAX = 100;
class dictionary;
class node
{
    string key, value;
    node *next;

public:
    friend class dictionary;
    node()
    {
        next = NULL;
    }
    node(string key, string value)
    {
        this->key = key;
        this->value = value;
        next = NULL;
    }
};

class dictionary
{
    node *head[MAX];

public:
    dictionary()
    {
        for (int i = 0; i < MAX; i++)
            head[i] = NULL;
    }

    bool deleteWord(string word)
    {
        int index = hashf(word);
        node *tmp = head[index];
        node *par = head[index];
        if (tmp == NULL) // if no word is present at that index
        {
            return false;
        }
        if (tmp->key == word && tmp->next == NULL) // only one word is present
        {
            tmp->next = NULL;
            delete tmp;
            return true;
        }
        // tmp=tmp->next;
        while (tmp->key != word && tmp->next != NULL)
        {
            par = tmp;
            tmp = tmp->next;
        }
        if (tmp->key == word && tmp->next != NULL)
        {
            par->next = tmp->next;
            tmp->next = NULL;
            delete tmp;
            return true;
        }
        else // delete at end
        {
            par->next = NULL;
            tmp->next = NULL;
            delete tmp;
            return true;
        }
        return false;
    }
    
    bool insert(string word, string meaning)
    {
        int index = hashf(word);
        node *p = new node(word, meaning);

        if (head[index] == NULL)
        {
            head[index] = p;
            
            return true;
        }
        else
        {
            node *start = head[index];
            while (start->next != NULL)
                start = start->next;

            start->next = p;
           
            return true;
        }
        return false;
    }
    int hashf(string word)
    {
        int asciiSum = 0;
        for (int i = 0; i < word.length(); i++)
        {
            asciiSum = asciiSum + word[i];
        }
        return (asciiSum % 100);
    }

    void print()
    {
        for (int i = 0; i < MAX; i++)
        {
            node *start = head[i];
            if (start == NULL)
                continue;
            cout << "WORD"
                 << "\t"
                 << "MEANING" << endl;
            while (start != NULL)
            {
                cout << "\n"
                     << start->key << "\t" << start->value<<endl;
                start = start->next;
            }
        }
    }
};

int main()
{
    dictionary d;
    int choice;
    string word, meaning;
    do
    {
        cout << "1.Insert Word\n"
             << "2.Delete Word\n"
             << "3.Print Dictionary\n"
             << "Enter Your Choice :";
        cin >> choice;
        switch (choice)
        {
        case 1:
            cout << "Enter Word: "<<endl;
            cin >> word;
            cout << "Enter Meaning: "<<endl;
            cin >> meaning;
            d.insert(word, meaning);
               
            break;
        case 2:
            cout << "Enter Word to Delete: ";
            cin >> word;
            if (d.deleteWord(word))
                cout << " Word is deleted.";
            else
            {
                cout << "\nFailed to delete " << word;
            }
            break;
        case 3:
            d.print();
            break;

        default:
            cout << "\nWrong Choice.";
        }

    } while (choice != 0);

    return 0;
}
