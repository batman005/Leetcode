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
    ArrayList<Integer> ls = new ArrayList<>();
    private void Inorder(TreeNode root, ArrayList ls){
        if(root == null){
            return;
        }
        Inorder(root.left,ls);
        ls.add(root.val);
        Inorder(root.right,ls);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root,ls);
        return ls.get(k-1);
    }
}