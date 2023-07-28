class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maximum = nums[0];
        for(int i = 0; i<nums.length;i++){
          sum += nums[i];
            // if the sum is greater than maximum replace it with sum
          if(sum>maximum) 
              maximum = sum;
            //if the sum is negative then it will erase it 
           if(sum<0) 
                sum = 0;
        }
        return maximum;
    }
}