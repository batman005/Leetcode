class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;
        boolean[][] visited = new boolean[rows][columns];
        
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                  // if you find first character of word which we finding
                // search the next characters in all 4 directions
                if(word.charAt(0) == board[i][j] && searchWord(i, j , 0, board, word,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    
    public boolean searchWord(int i, int j, int index, char[][] board, String word, boolean[][] visited){
        if(index == word.length()){
            return true;
        }
          // boundary checks and if current character != word index
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index) != board[i][j] || visited[i][j]){
            return false;
        }
        visited[i][j] = true;
     if(
            // search in right direction
            searchWord(i + 1, j, index + 1, board, word, visited) ||
            // search in left direction 
            searchWord(i - 1, j, index + 1, board, word, visited) ||
            // search in down direction 
            searchWord(i, j + 1, index + 1, board, word, visited) ||
            // search in up direction
            searchWord(i, j - 1, index + 1, board, word, visited)
        ){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
