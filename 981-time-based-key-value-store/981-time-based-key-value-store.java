class TimeMap {
    private Map<String, Map<Integer, String>> map = new HashMap<>();
    private Map<String, List<Integer>> keys = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new HashMap<Integer, String>());
        map.get(key).put(timestamp, value);
        
        keys.putIfAbsent(key, new ArrayList<Integer>());
        keys.get(key).add(timestamp);
    }
    
    
    public String get(String key, int timestamp) {
        Map<Integer, String> values = map.getOrDefault(key, new HashMap<>());
        List<Integer> times = keys.getOrDefault(key, new ArrayList<>());
        
        int idx = findIndex(times, timestamp);
        if (idx < 0) {
            return "";
        }
        
        return values.get(times.get(idx));
    }
    
    private int findIndex(List<Integer> list, int target) {
        int l = 0;
        int h = list.size()-1;
        
        while (l <= h) {
            int mid = l + (h-l)/2;
            
            if (list.get(mid) == target) {
                return mid;
            }
            if (list.get(mid) < target) {
                l = mid+1;
            } else {
                h = mid-1;
            }
        }
        return l-1;
    }
}