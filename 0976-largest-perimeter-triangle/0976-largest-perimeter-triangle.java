class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        //largest value first thats why traveling from back
        for(int i = nums.length - 1; i >1; i--){
            
             // The sum of the length of the two sides of a triangle is greater than the length of the third side. 
               if(nums[i] < nums[i - 1] + nums[i - 2]){
            return nums[i] + nums[i - 1] + nums[i - 2];
        }
        }
     
        return 0;
    }
}