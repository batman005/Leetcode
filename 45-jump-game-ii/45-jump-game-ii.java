class Solution {
    //2 pointer
    public int jump(int[] nums) {
       int cnt = 0, low = 0, high = 0, n = nums.length;
        while(high < n  - 1){
            int maxJump = 0;
            for(int i = low; i <= high; i++)
                maxJump = Math.max(maxJump, i + nums[i]);
            
            low  = high + 1;
            high = maxJump;
            cnt++;
        }
        return cnt;
    }
}