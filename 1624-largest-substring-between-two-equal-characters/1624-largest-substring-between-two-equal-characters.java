class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] indices = new int[26];
        
        int maxLen = -1;
        //a == 97 - 97   --> 0 index
        //b == 98 - 97 --> 1 index
        // dhyaan se yaad rakhna aur samjhna
        // int idx = s.charAt(i) - 'a'; 
        for(int i = 0; i < s.length(); i++){
             int idx = s.charAt(i) - 'a';  
            
            if(indices[idx] > 0){
                //the current char is a repeating one
                maxLen = Math.max(maxLen, i - indices[idx]);
                
            } else {
                //we are seeing this char for the first time
                indices[idx] = i + 1;
            }
        }
        
        return maxLen;
        
    }
}