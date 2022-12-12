class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;
        int[] arr = new int[n - 1];
        arr[0] = 2;
        arr[1] = 3;
        for(int i = 2; i < n - 1; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 2];
    }
}