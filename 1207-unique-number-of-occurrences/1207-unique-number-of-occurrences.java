class Solution {

    public boolean uniqueOccurrences(int[] a) {
        Map<Integer, Integer> map = new HashMap();
        for (int x : a) map.put(x, map.getOrDefault(x, 0) + 1);
        Set<Integer> set = new HashSet(map.values());
        return map.size() == set.size();
    }
}
