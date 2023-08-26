class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = -1;
        int j = -1;
        
        HashMap<Character,Integer> map = new HashMap<>();
        while(true){
            //acquire
            boolean flag = false;
            boolean flag2 = false;
            while(i < s.length() - 1){
                flag = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch,0) + 1);
                if(map.get(ch) == 2){
                    break;
                }
                else {
                    int len = i - j;
                    if(len > ans){
                        ans = len;
                    }
                }
            }
            //release
            while(j < i){
                flag2 = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 1){
                    break;
                }
            }
            if(!flag && !flag2){
                break;
            }
        }
        return ans;
    }
}
