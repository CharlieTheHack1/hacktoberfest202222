/**
 * QuickSort
 */
import java.util.*;
public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        quickSort(arr,0,n-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void quickSort(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr,l,h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }

    static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i=l, j=h;
        while(i < j){
            while(arr[i] <= pivot && i<h) i++;
            while(arr[j] >  pivot && j>l) j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp; 
        return j;
    }
    
}
