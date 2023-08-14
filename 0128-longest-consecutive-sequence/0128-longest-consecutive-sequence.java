class Solution {
    public int longestConsecutive(int[] nums) {
      HashMap<Integer, Boolean> map = new HashMap<>();
        for(int val: nums){
            map.put(val, true);
        }
        for(int val: nums){
            if(map.containsKey(val  - 1)){
                map.put(val, false);
            }
        }
        
        int maxStartPoint = 0;
        int maxlength = 0;
        for(int val: nums){
            if(map.get(val) == true){
                int templength = 1;
                int tempStartPoint = val;
                while(map.containsKey(tempStartPoint + templength)){
                    templength++;
                }
                if(templength > maxlength){
                    maxStartPoint = tempStartPoint;
                    maxlength = templength;
                }
            }
        }
        return maxlength;
    }
}