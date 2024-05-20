class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u'); //HashSet with vowels
        int count = 0;
        for(int i = 0; i < k; i++){
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        
        int answer = count;
        //sliding part
        //abciiidef
        //abc
        //bci
        for(int i = k; i < s.length();i++){
            count +=  vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i - k)) ? 1: 0; //a got remove
            answer = Math.max(answer, count);                        
                                     
       }                             
        
        return answer;
        
    }
}