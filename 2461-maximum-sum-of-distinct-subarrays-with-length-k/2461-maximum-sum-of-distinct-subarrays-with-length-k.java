class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while(i < nums.length){
            while(j < nums.length && set.size() < k && !set.contains(nums[j])){
                set.add(nums[j]);
                currSum +=nums[j];
                j++;
            }
            if(set.size() == k)
                maxSum  = Math.max(currSum ,maxSum);
            currSum -=nums[i];
            set.remove(nums[i]);
            i++;
        }
        return maxSum;
    }
}