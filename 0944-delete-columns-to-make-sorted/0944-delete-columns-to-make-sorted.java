class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0, col = strs[0].length(), row = strs.length;
        System.out.println(col);
        System.out.println(row);
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row - 1; j++) {
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    cnt++;
                    break;
                }                    
            }
        }
        return cnt;
    }
}