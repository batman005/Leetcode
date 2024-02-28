class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean isRow = false;
        boolean isCol = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0) isRow = true;
                    if(j == 0) isCol = true;
                }
            }
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    // the curr row is bound to become zero or the curr col is bound to become 0
                    matrix[i][j] = 0;
                }
            }
        }
        if(isRow){
            for(int i = 0; i < col; i++){
                matrix[0][i] = 0;
            }
        }
        if(isCol){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}