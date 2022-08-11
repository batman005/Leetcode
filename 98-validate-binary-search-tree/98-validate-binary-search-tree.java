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
import java.util.Optional;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Optional.empty(), Optional.empty());
    }
    
    private boolean isValidBST(TreeNode node, Optional<Integer> min, Optional<Integer> max) {
        if (node == null) {
            return true;
        }
        if ((min.isPresent() && node.val <= min.get()) || (max.isPresent() && node.val >= max.get())) {
            return false;
        }
        Optional val = Optional.of(node.val);
        return isValidBST(node.left, min, val) && isValidBST(node.right, val, max);
    }
}