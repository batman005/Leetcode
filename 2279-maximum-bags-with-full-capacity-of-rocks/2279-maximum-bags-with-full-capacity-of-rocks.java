class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        // reuse capacity array to find the capacity remaining for each bag
        for(int i=0; i<n; i++) {
            capacity[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(capacity);
        int i;
        for(i=0; i<n; i++) {
            if(capacity[i] > additionalRocks) {
                break;
            }
            additionalRocks -= capacity[i];
        }
        return i;
    }
}