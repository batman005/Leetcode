class Solution {
    public int tribonacci(int n) {

        // 0th element of your series is 0

        if(n==0){
            return 0;
        }
        // 1st and 2nd element of the series are 1 (Given in the question)
        if(n == 1 || n==2){
            return 1;
        }
        //Create a dp array of n+1 size
        int dp[] = new int [n+1];
        //intialize first three elements
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        // start the loop from 3 because 0,1,2 are pre intialize
        for(int i = 3; i <= n; i++){

            dp[i] = dp[i-1] + dp[i-2] +dp[i-3];
        }
        return dp[n]; 
    }
}