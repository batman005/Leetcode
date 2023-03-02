class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen = new boolean[26];
        for(char ch: letters){
            seen[ch - 'a'] = true;
        }
        
        while(true){
            target++;
            if(target > 'z') target =  'a';
            if(seen[target - 'a']) return target;
        }
    }
}