class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int half1 = 0;
        int half2 = 0;
        if(str.length() == 0)
        {
            return true;
        }
        for(int i = 0; i < str.length()/2;i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                half1++;
            }
        }
        for(int i = str.length()/2; i < str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                half2++;
            }
        }
        return half1 == half2;
    }
}