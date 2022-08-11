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
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    
    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        return (min == null || root.val > min.val) && (max == null || root.val < max.val)
            && isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
}