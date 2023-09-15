class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int low = 0, high = row * col - 1;
        while(low <= high){
            int mid = low + high >> 1;
            int nums = matrix[mid / col][mid % col];
            
            if(nums == target) return true;
            else if(nums < target)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return false;
    }
}