class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int len = 0;
        while(right < s.length()){
            // were we find that element last time we will get our left index to front of that position
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            map.put(s.charAt(right),right);
            len = Math.max(len , right - left + 1);
            right++;
        }
        return len;
    }
}