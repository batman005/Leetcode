class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
       // System.out.println(hm);
        int count = 0;
        int sameCount = 0;
        int logic = 1;
        HashSet<String> hs = new HashSet<>();
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            String key = e.getKey();
            Integer val = e.getValue();
            if(key.charAt(0)==key.charAt(1)){
                if(val%2==0){
                    sameCount = sameCount + val;
                }else if(logic==1){
                    logic = 0;
                    sameCount = sameCount + val;
                }else{
                    sameCount = sameCount + (val-1);
                }
            }else{
                String rev = key.charAt(1)+""+key.charAt(0);
                //System.out.println("rev="+rev);
                if(hm.containsKey(rev) && !hs.contains(rev)){
                    count = count + 4*Math.min(hm.get(rev),hm.get(key));
                    hs.add(rev);
                    //System.out.println(count);
                }
                hs.add(key);
            }
        }
        count = count + (sameCount*2);
        return count;
    }
}