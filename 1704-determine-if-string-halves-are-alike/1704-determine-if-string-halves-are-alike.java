class Solution {
    public boolean halvesAreAlike(String s) {
       String s1 = s.substring(0, s.length()/2), s2 = s.substring(s.length()/2);
        
        int count1 = 0, count2 = 0;
        
        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' ||
               ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') count1++;
                        
            if(ch2 == 'a' || ch2=='e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' ||
               ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') count2++;
            
        }
        return count1 == count2;
    }
}