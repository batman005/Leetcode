class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        String first = sortString(s);
        String second = sortString(t);
        
        return first.equals(second);
    }
    private String sortString(String inputString){
    
    char tempArray[] = inputString.toCharArray();

    
    Arrays.sort(tempArray);

    
    return new String(tempArray);
     }
}