class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);   // sort the array
        if(nums.length<4)return res;
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;  // avoid duplicates
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;  //avoid duplicates
                int l=j+1;
            int r=nums.length-1;
            while(l<r){
                long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                if(sum==target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
					
                    while(l<r && nums[l] == nums[l+1])l++; // avoid duplicates
                    while(l<r && nums[r]== nums[r-1])r--;  //avoid duplicates
                    l++;
                    r--;
                }else if(sum<target){
                    l++;
                }else r--;
              }
            }
            
        }
        return res;
    
    }
}