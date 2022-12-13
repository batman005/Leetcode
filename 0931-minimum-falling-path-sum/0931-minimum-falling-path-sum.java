class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[rows][cols];
        for(int i = 0; i < cols; i++){
            int findPathSum = findPathSum(0, i, matrix, dp);
            ans = Math.min(ans, findPathSum);
        }
        return ans;
    }
    
    
    private int findPathSum(int r, int c, int[][] matrix, Integer[][] dp){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(r < 0 || r >= rows || c < 0 || c >= cols) return (int)1e9;
         if(r==rows-1) return matrix[r][c];
        if(dp[r][c] != null) return dp[r][c];
        int ans = Integer.MAX_VALUE;
        for(int i = -1; i <= 1; i++){
            int pathSum  = findPathSum(r+1,c+i, matrix,dp);
            ans = Math.min(ans,pathSum);
        }
        return dp[r][c] = matrix[r][c] + ans;
    }
}