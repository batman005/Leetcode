class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      ArrayList<List<Integer>> res = new ArrayList<>();
         Arrays.sort(nums);
         
         for(int i = 0; i < nums.length - 3; i++){
            if(i != 0 && nums[i] == nums[i - 1]){        //to check duplicates of i pointer
                continue;
            }
             for(int j = i + 1; j <  nums.length - 2; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]){      //to check duplicates of j pointer
                    continue;
                }
                 int left = j + 1;
                 int right = nums.length - 1;
                 
                 while(left < right){
                     long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                     if(sum == target){
                         List<Integer> list = new ArrayList<>();
                         list.add(nums[i]);
                         list.add(nums[j]);
                         list.add(nums[left]);
                         list.add(nums[right]);
                         res.add(list);

                         left++;
                         right--;
                      while(left < right && nums[left] == list.get(2)) left++;     //check for duplicates
                      while(left < right && nums[right] == list.get(3)) right--; 
                     }
                     else if(sum < target){
                         left++;
                     }else
                         right--;
                 }
              }
         }
         return res;    
}
}