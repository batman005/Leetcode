class Solution {
    public void rotater(int[] nums, int i,int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k > n)
            k %= n;
        
        rotater(nums, 0, n - 1);
        rotater(nums, 0, k - 1);
        rotater(nums, k, n - 1);
    }
}