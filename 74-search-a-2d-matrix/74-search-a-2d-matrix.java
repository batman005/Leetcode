class Solution {
 public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length == 0) return false;
         int row = matrix.length; int col = matrix[0].length;
     //starting index 0 and high = (row *col)(total)- 1
          int low = 0, high = row * col - 1; 
     
        while(low <= high){
            int mid = low + (high - low) / 2;
            int nums = matrix[mid / col][mid %  col]; // getting index 
            if(nums == target) return true;
            else if(nums < target) low = mid + 1;
            else high = mid - 1;
        }
     return false;
    }
}