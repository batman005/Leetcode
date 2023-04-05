class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = nums[0], avg = nums[0];
        
        for(int i = 1; i < nums.length; ++i){
            sum += nums[i];
            
            if(nums[i] > avg){
                long x = sum / (i + 1);
                if(x >= avg){
                    if(sum % (i + 1) != 0) avg = x + 1;
                    else avg = x;
                }
            }
        }
        return (int) avg;
    }
}