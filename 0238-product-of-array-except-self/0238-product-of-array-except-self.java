class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        
        int leftPrefixProduct = 1;
        for(int i= 0; i < nums.length; i++){
             ans[i] = ans[i]*leftPrefixProduct;
             leftPrefixProduct = leftPrefixProduct * nums[i];
         }
        
        int rightPrefixProduct = 1;
        
        for(int i= nums.length - 1; i >= 0; i--){
              ans[i] = ans[i]*rightPrefixProduct;
             rightPrefixProduct = rightPrefixProduct * nums[i];
        }
                
        return ans;
        
    }
}