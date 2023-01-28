class SummaryRanges {
    TreeMap<Integer, int[]> map;
    /** Initialize your data structure here. */
    public SummaryRanges() {
        map = new TreeMap<>();
    }
    
    public void addNum(int value) {
        if (map.containsKey(value)) return;
        Integer l = map.lowerKey(value);
        Integer h = map.higherKey(value);
        if (l != null && h != null && map.get(l)[1] + 1 == value && h == value + 1) {
            map.get(l)[1] = map.get(h)[1];
            map.remove(h);
        } else if (l != null && map.get(l)[1] + 1 >= value) {
            map.get(l)[1] = Math.max(map.get(l)[1], value);
        } else if (h != null && h == value + 1) {
            map.put(value, new int[] {value, map.get(h)[1]});
            map.remove(h);
        } else {
            map.put(value, new int[] {value, value});
        }
    }
    
    public int[][] getIntervals() {
        int[][] res = new int[map.size()][2];
        int i = 0;
        for (int[] interval : map.values()) {
            res[i++] = interval;
        }
        return res;
    }
}
