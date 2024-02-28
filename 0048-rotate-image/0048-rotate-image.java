class Solution {
    public void rotate(int[][] matrix) {
        //clock wise rotation
        // col reverse 
        
        int row = matrix.length;
        for(int col = 0; col < row; col++){
            int i = 0; // 0th row
            int j= row - 1; // last row
            while(i <= j){
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }
        
        //transpose
        for(int i = 0; i < row; i++){
            for(int j = i + 1; j < row; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}