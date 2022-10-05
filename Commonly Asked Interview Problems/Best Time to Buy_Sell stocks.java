class Solution {
    public int maxProfit(int[] prices) {               
        int minLeft = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0;i<prices.length;i++){
            minLeft = Math.min(minLeft, prices[i]);
            
            maxProfit = Math.max(prices[i] - minLeft, maxProfit);
        }
        return maxProfit;
    }
}
