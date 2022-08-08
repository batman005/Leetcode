class Solution {
    public int lengthOfLIS(int[] nums) {
       int[] dp = new int[nums.length];
        int size = 0;
        
        for(int x: nums){
            int i = Arrays.binarySearch(dp, 0, size, x);
            if(i < 0)
                i = -(i + 1);
            dp[i] = x;
            if(i == size) size++;
        }
        return size;
    }
}