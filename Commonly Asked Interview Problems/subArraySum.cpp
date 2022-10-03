/* 
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
*/

{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(int arr[], int n, long long s)
    {       vector<int > v;
            int l=0;
            int r=0;
            long long sum=0;
            while(true){
                
                if(s==0 && arr[l]!=0){
                    v.push_back(-1);
                    return v;
                }
                
                
                if(sum==s)
                break;
                
                
                 sum=sum+arr[r];
                
                 while(sum>s){
                    sum=sum-arr[l];
                    l+=1;
                }
               
                
                r=r+1;
                
                if(r>n){
                    v.push_back(-1);
                    return v;
                }
                
                
                
                
                
                
            }
            
            v.push_back(l+1);
            v.push_back(r);
            
            return v;
            
        // Your code here
    }
};
