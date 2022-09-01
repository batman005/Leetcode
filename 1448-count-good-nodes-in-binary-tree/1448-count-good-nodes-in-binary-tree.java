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
 public int goodNodes (TreeNode root) {
		// a call to our self-made method
        return goodNodesUtil (root, root.val);        
    }
    
    public int goodNodesUtil (TreeNode root, int maxPathValue) {
        
		// initialise the number of good nodes in the subtree with THIS node as root
		// if THIS node's value is greater than maxPathValue, count THIS as a good node
		int count = 0;
        if (root.val >= maxPathValue) {
            count++;
        }
		
		// Before recursive calls to the sub-trees, save up by checking for NULL
		// Instead of updating maxPathValue, you can simply pass the maximum value
		// Notice the second argument passed, it is the new maximum
        if (root.left != null) {
            count = count + goodNodesUtil(root.left, Math.max(root.val, maxPathValue));
        }
        if (root.right != null) {
            count = count + goodNodesUtil(root.right, Math.max(root.val, maxPathValue));
        }
        
        return count;
    }
}