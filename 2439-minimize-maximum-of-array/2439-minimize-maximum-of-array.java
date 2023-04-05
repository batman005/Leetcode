class Solution {
    public int minimizeArrayValue(int[] nums) {
        int start = 0, end = (int) 1e9, ans = 0;
        while( start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(mid , nums)){
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    
    private boolean isPossible(int max, int  array[]){
        long x = 0;
        for(int i : array){
            if(i > max){
                long c = (i - max);
                if(c > x) return false;
                x -= c; 
            } else {
                x += (max - i);
            }
        }
        
        return true;
    }
}