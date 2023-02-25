class Solution {
      //Sliding window
        // Take a window of size 2 and compare the values.
       //If the later value is greater that means a profit. 
      // Store the profit in your result (accumulate the result).
// If the later value is smaller that means a loss. So, we won't do that trade. Just move 1 index ahead.
//	6. Repeat step 3 till the end of the array/list.
//	7. Return the result.
    public int maxProfit(int[] prices) {
      
          int left = 0;
          int right = 1;
          int maxProfit = 0;
        while(right < prices.length){
            if(prices[left]<prices[right]){
                int profit = prices[right] - prices[left];
                if(profit > 0){
                    maxProfit += profit;
                }
                left++;
            }else{
                left  = right;
            }
            right++;
         }
        
        return maxProfit;
    }
}