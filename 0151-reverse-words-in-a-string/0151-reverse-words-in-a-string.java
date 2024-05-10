class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        List<String> wordList= Arrays.asList(s.split("\\s+"));
        
         //System.out.println(wordList);
        
        Collections.reverse(wordList);
        // System.out.println(wordList);
        
        return String.join(" ",wordList);
    }
}