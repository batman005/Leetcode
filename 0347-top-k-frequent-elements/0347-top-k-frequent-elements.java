class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0){
            return new int[k];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> map.get(b) - map.get(a));
        for(int n: map.keySet()){
            pq.add(n);
        }
        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}