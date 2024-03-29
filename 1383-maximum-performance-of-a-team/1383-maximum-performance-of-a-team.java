class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
     int[][] engineerProperties = new int[n][2];
        //add both the speed and efficiency of engineers to a 2D array
        for(int i = 0; i < n; i++)
            engineerProperties[i] = new int[]{efficiency[i], speed[i]};
        //sort the above array in descending order of efficiency
        //when we iterate this array from left to right , we will always encounter an engineer with lesser efficiency
        // hence, at any point during out iteration, the min efficiency should be the current efficiency of the engineer
        Arrays.sort(engineerProperties,(int[] a, int[] b) -> b[0] - a[0]);
        
        long result = 0, speedSum = 0;
    // maintain a min heap of size 'k' containing the speed of engineers
        PriorityQueue<Integer> speedMinHeap = new PriorityQueue<>(k);
        for (int i = 0; i < n; i++) {
            // the minimum efficiency should be the current efficiency since the properties array is sorted in descending order of efficiency
            int minEfficiency = engineerProperties[i][0];
            // add the speed of the current engineer to the min heap
            speedMinHeap.add(engineerProperties[i][1]);
            // if the min heap size exceeds 'k', pop the engineer with the minimum speed
            // we might even pop the current engineer if both their speed and efficiency are less than other previous engineers
            // in that case, the below computation won't make sense but it won't impact the max performance answer
            speedSum += engineerProperties[i][1];
            if (speedMinHeap.size() > k) speedSum -= speedMinHeap.poll();
            // keep track of the maximum efficiency encountered so far across a group of <= k engineers
            result = Math.max(result, (minEfficiency * speedSum));
        }
        // return result mod 1e9+7
        return (int)(result % 1_000_000_007l);
    }
}