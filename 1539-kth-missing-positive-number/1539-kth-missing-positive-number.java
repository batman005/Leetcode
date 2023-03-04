class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1, mid;
        while(left <= right){
            mid  = left + (right - left) / 2;
            if(arr[mid] - 1 - mid < k){
                left = mid + 1;
            } else 
                right = mid - 1;
        }
        return left + k;
    }
}