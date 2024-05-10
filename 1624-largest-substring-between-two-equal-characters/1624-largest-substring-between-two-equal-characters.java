class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
          Map<Character, Integer> Indicies = new HashMap();
          int ans = -1;
        
        for(int i = 0; i < s.length(); i++){
            if(Indicies.containsKey(s.charAt(i))){
                ans = Math.max(ans, i - Indicies.get(s.charAt(i)));
            } else {
                Indicies.put(s.charAt(i), i + 1);
            }
        }
        return ans;
    }
}