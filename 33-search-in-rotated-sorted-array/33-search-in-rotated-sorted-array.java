class Solution {

public int search(int[] nums, int target) {

    if (nums.length == 1) {
        if (nums[0] == target) {
            return 0;
        } else {
            return -1;
        }
    }


    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int mid = (left + right) / 2;
        int midValue = nums[mid];

        if (midValue == target) {
            return mid;
        }

        if (nums[left] == target) {
            return left;
        }

        if (nums[right] == target) {
            return right;
        }

        //array is rotated
        if (nums[left] > nums[right]) {
            //find which part is rotated;
            if (nums[left] < midValue) {
                //right is rotated
                //check if value in left
                if (target > nums[left] && target < midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                //left is rotated
                //check in right
                if (target > nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


        } else {
            //array is not rotated do normal binary search
            if (target > nums[left] && target < midValue) {
                right = mid - 1;
            } else if (target > nums[mid] && target < nums[right]) {
                left = mid + 1;
            } else {
                return -1;
            }
        }


    }

    return -1;
}
}