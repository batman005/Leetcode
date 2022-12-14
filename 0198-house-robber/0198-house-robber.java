class Solution {
    //TC: O(N);
    //SC: O(N);
    public int rob(int[] nums) {
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return topToBottomApproach(nums,nums.length - 1, memo);
    }
    
    
    public int topToBottomApproach(int[] nums, int index, int[] memo){
        if(index < 0)
            return 0;
        
        if(memo[index] != -1)
            return memo[index];
        
        int withCurrHouse = nums[index] + topToBottomApproach(nums, index - 2, memo);
        int withoutCurrHouse = topToBottomApproach(nums, index - 1, memo);
        memo[index] = Math.max(withCurrHouse, withoutCurrHouse);
        
        return memo[index];
        }
}