class Solution {
    public long putMarbles(int[] weights, int k) {
         int n = weights.length;
         List<Integer> candidates = new ArrayList<>();
        for(int i = 0; i < n - 1; i++){
            candidates.add(weights[i] + weights[i + 1]);
        }
        Collections.sort(candidates);
        long min_sum = 0, max_sum = 0;
        for(int i = 0; i < k - 1; i++){
            min_sum += candidates.get(i);
            max_sum += candidates.get(n - 2 - i);
        }
        return max_sum - min_sum;
    }
}