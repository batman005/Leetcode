import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = -1;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });

        int[] prev = intervals[0];
        for (int[] interval : intervals) {
            if (interval[0] < prev[1])
                ans++;
            else
                prev = interval;
        }
        return ans;
    }
}
