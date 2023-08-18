class Solution {

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        if (len1 > len2) return findMedianSortedArrays(arr2, arr1);

        int positiveInfinity = Integer.MAX_VALUE;
        int negativeInfinity = Integer.MIN_VALUE;

        int left = -1, right = len1 - 1;
        int len = len1 + len2;
        int half = len / 2;
        while (true) {
            int mid = (left + right) / 2;
            int rem = half - mid - 2;

            int aLeft = mid >= 0 ? arr1[mid] : negativeInfinity;
            int aRight = mid + 1 < len1 ? arr1[mid + 1] : positiveInfinity;
            int bLeft = rem >= 0 ? arr2[rem] : negativeInfinity;
            int bRight = rem + 1 < len2 ? arr2[rem + 1] : positiveInfinity;

            if (aLeft <= bRight && bLeft <= aRight) {
                if (len % 2 == 1) {
                    return Math.min(aRight, bRight);
                }

                return (double) (Math.min(aRight, bRight) + Math.max(aLeft, bLeft)) / 2;
            }

            if (aLeft > bRight) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
