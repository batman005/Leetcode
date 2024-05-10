class Solution {
    public void nextPermutation(int[] nums) {
  int n = nums.length;

  int ind = -1;
  for (int i = n - 2; i >= 0; i--) {
    if (nums[i] < nums[i + 1]) {
      ind = i;
      break;
    }
  }

  if (ind == -1) {
    reverse(nums, 0, n - 1); // Reverse the entire array
    return;
  }

  for (int i = n - 1; i > ind; i--) {
    if (nums[i] > nums[ind]) {
      swap(nums, i, ind);
      break;
    }
  }

  // Reverse the subarray from ind + 1 to the end
  reverse(nums, ind + 1, n - 1);

  // No need to return anything as the permutation is created in-place
}

// Helper function to reverse a subarray
private static void reverse(int[] nums, int start, int end) {
  while (start < end) {
    swap(nums, start, end);
    start++;
    end--;
  }
}

// Helper function to swap elements
private static void swap(int[] nums, int i, int j) {
  int temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
}
    } 