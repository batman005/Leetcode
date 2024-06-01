class Solution {
    public int minimumRecolors(String blocks, int k) {
       Set<Character> white = Set.of('W');
       int count = 0;
       for(int i = 0; i < k; i ++){
           count += white.contains(blocks.charAt(i)) ? 1 : 0;
       }
        int answer = count;
        
        for(int i = k; i < blocks.length(); i++){
            count += white.contains(blocks.charAt(i)) ? 1 : 0;
            count -= white.contains(blocks.charAt(i - k)) ? 1 : 0;
            answer = Math.min(answer, count);
        }
        return answer;
    }
}
