class Solution {
    private int solve(int[][] grid, int i, int j, int n, int m) {
        if (i == n) return j;
        if (i < 0 || j < 0 || j == m) return -1;
        if (grid[i][j] == 1) {
            if (j + 1 == m || (j + 1 < m && grid[i][j + 1] == -1)) return -1;
            return solve(grid, i + 1, j + 1, n, m);
        } else {
            if (j - 1 == -1 || (j - 1 >= 0 && grid[i][j - 1] == 1)) return -1;
            return solve(grid, i + 1, j - 1, n, m);
        }
    }

    public int[] findBall(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++)
            res[i] = solve(grid, 0, i, n, m);
        return res;
    }
}