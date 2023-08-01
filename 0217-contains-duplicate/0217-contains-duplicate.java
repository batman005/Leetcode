class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet repeat = new HashSet<>();
         for(int n : nums){
            if(repeat.contains(n)){
                return true;
            }
             repeat.add(n);
         }
        return false;
    }
}