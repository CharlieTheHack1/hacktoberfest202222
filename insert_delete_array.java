import java.io.*;
 
// Java Program to Insert an element
// at a specific position in an Array
class hello {
    static void insertElement(int arr[], int n, int x,
                              int pos)
    {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }

	static int findElement(int arr[], int n, int key)
    {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
 
        return -1;
    }
 
    // Function to delete an element
    static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
 
        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }
 
    
    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };
 
        int n = arr.length;
        int key = 30;
 
        
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

	insertElement(arr, n, x, pos);
        n += 1;
         
          // Function call
        n = deleteElement(arr, n, key);
 
        
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}