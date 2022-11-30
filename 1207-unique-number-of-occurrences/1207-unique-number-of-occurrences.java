class Solution {
    public boolean uniqueOccurrences(final int[] arr) {
        final Map<Integer,Integer> map = new HashMap<>();
        
        for(int k : arr)
            map.put(k, map.getOrDefault(k,0) + 1);
        
        return map.size() == map.values().stream().distinct().count();
    }
}