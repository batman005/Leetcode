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
       
    public static int max(TreeNode root){
       if(root.right != null){
           return max(root.right);
       }
        else{
            return root.val;
        }
    
    
    }
    
    
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        
        if(root.val > key) {
            root.left = deleteNode(root.left , key);
        } 
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else {
            if(root.right != null && root.left != null){
                int leftMax = max(root.left);
                root.val  = leftMax;
                root.left = deleteNode(root.left, leftMax);
            }
            else if(root.right != null){
                return root.right;
            } else if(root.left != null){
                return root.left;
            }
            else{
                return null;
            }
        }
        return root;
    }
}