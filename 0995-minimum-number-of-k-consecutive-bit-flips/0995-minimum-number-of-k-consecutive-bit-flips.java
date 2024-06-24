class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int currentFlips = 0;
        
        
        int totalFlips = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i >= k && nums[i - k] == 2){
                currentFlips--;
            }
            
            if((currentFlips % 2 ) == nums[i]){
                if(i + k > nums.length){
                    return -1;
                }
                nums[i] = 2;
                currentFlips++;
                totalFlips++;
            }
        }
        return totalFlips;
    }
}