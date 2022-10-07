import java.util.Arrays;
 
public class InsertionSort
{
    // Recursive function to sort an array using
    // insertion sort
    static void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;
      
        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );
 
        int last = arr[n-1];
        int j = n-2;
      
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
     
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};
      
        insertionSortRecursive(arr, arr.length);
         
        System.out.println(Arrays.toString(arr));
    }
}
