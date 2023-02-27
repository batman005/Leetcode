class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 0;
        int maxProfit = 0;
        
        while(right < prices.length){
             int temp = prices[right] - prices[left];
             if (temp < 0){
                 left = right;
             } else {
                 maxProfit = Math.max(maxProfit, temp);
             }
            right++;
        }
        return maxProfit;
    }
}