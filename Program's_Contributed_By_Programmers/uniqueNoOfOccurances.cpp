// https://leetcode.com/problems/unique-number-of-occurrences/

#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;

//Unique Number of Occurrences

int main(){
    
class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {

        //Counting sort

        //Since our values are limited to [-1000, 1000], we can use an array instead of hash set to count occurrences. 
        //Then, we can sort our array and check that no adjacent numbers are the same.

       short m[2001] = {}, s[1001] = {};

       //We can also note that the array length is limited to 1000, so no element will repeat more than 1000 times. 
       //Therefore we can use another array to do the counting sort over the occurrences.

       for (auto n : arr) ++m[n + 1000];
       for (auto i = 0; i < 2001; ++i)
       if (m[i] && ++s[m[i]] > 1) return false;
       return true;

    }

};

}





/*

Another Approach: Map and set

//Count occurences of each number using a hash map. Insert all occurences into a hash set. 
//If, after the insert, the sizes of hash map and set are equal, then all occurences are unique.

bool uniqueOccurrences(vector<int>& arr) {
  unordered_map<int, int> m;
  unordered_set<int> s;
  for (auto n : arr) ++m[n];
  for (auto& p : m) s.insert(p.second);
  return m.size() == s.size();
}

//We can improve this for the average case by checking the result of 
     s.insert(), which returns false if an element is already there.

bool uniqueOccurrences(vector<int>& arr) {
  unordered_map<int, int> m;
  unordered_set<int> s;
  for (auto n : arr) ++m[n];
  for (auto& p : m)
      if (!s.insert(p.second).second) return false;
  return true;
}


Time: O(n), where n is the size of input array.
Memory: O(m), where m is the number of unique elements (we store counts in hash map and set).


*/