/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public boolean findTarget(TreeNode root, int k) {
	List<Integer> sortedList = new ArrayList<>();
	// collect the nodes in sorted order
	collectNodes(root, sortedList);
	int left = 0, right = sortedList.size() - 1;
	// now use two pointers to check if there are two numbers that sum to k
	// if the sum is greater than k then we know we need to replace a number
	// the bigger value of the two numbers we sorted with a small number 
	// so we decrement the right pointer. Similarly, if the sum is less than k
	// then we know that we need to replace the smaller value with a larger value
	// so we increment the left pointer.
	while (left < right) {
		int sum = sortedList.get(left) + sortedList.get(right);
		if (sum > k) {
			right--;
		} else if (sum < k) {
			left++;
		} else {
			return true;
		}
	}
	return false;
}
// traverse tree inorder... search left portion add current nodes
// val to list then vist right. This will lead to collecting node values in sorted order because
// the tree is a Binary Search Tree with the given properies that all the elements on the left
// of the current node will be less and all the elements to the right will be greater.
public void collectNodes(TreeNode root, List<Integer> sortedList) {
	if (root == null) {
		return;
	}
	collectNodes(root.left, sortedList);
	sortedList.add(root.val);
	collectNodes(root.right, sortedList);
}
    
}