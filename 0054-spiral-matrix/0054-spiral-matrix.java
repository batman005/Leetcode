class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int m = matrix.length;
         int n = matrix[0].length;
         int startrow = 0;
         int endcol = n - 1;
         int endrow = m - 1;
         int startcol = 0;
         List<Integer> res = new ArrayList<>();
         int count = n * m;
         while(count >= 0){
             //start row
             for(int i = startcol; i <= endcol; i++ ){
                 res.add(matrix[startrow][i]);
                 count--;
             }
             startrow++;
             if(count == 0) break;
             
             //end col
             for(int i = startrow; i <= endrow; i++){
                 res.add(matrix[i][endcol]);
                 count--;
             }
             endcol--;
             if(count == 0) break;
             
             //er
             for(int i = endcol; i >= startcol; i--){
                 res.add(matrix[endrow][i]);
                 count--;
             }
             endrow--;
             if(count == 0) break;
             
             
             //sc 
             for(int i = endrow; i >= startrow; i--){
                 res.add(matrix[i][startcol]);
                 count--;
             }
             startcol++;
             if(count == 0) break;
             
             
         }
        return res;
    }
}