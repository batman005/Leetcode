class Solution {
 public boolean searchMatrix(int[][] matrix, int target) {
         List<Integer> res = new ArrayList<>();
         for(int i = 0; i < matrix.length; i++){
             for(int j= 0; j < matrix[0].length; j++){
                 res.add(matrix[i][j]);
             }
         }
        return Collections.binarySearch(res, target) >= 0;
    }
}