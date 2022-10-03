/*
42. Trapping Rain Water
    Hard
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
             In this case, 6 units of rain water (blue section) are being trapped.
*/
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int[] l = new int[n];
        int[] r = new int[n];
        r[n-1] = height[n-1];
        l[0] = height[0];
        for(int i=1; i<n; i++)
            l[i] = Math.max(l[i-1],height[i]);
        for(int j=n-2; j>=0; j--)
            r[j] = Math.max(r[j+1],height[j]);
        for(int i=1; i<n-1; i++){
            water += Math.min(l[i],r[i])-height[i];
        }
        return water;
    }
}
