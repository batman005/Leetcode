class Solution {
    public int minDeletionSize(String[] strs) {
        int r = strs.length;
        int c = strs[0].length();
        
        
        int answer = 0;
        
        for(int col = 0; col < c; col++){
            for(int row = 1; row < r; row++){
                if(strs[row].charAt(col)< strs[row - 1].charAt(col)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}