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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> currPath = new ArrayList<>();
        List<List<Integer>> allPaths = new ArrayList<>();
        pathSum(root,targetSum,currPath,allPaths);
        return allPaths;
    }
    
    public void pathSum(TreeNode root, int targetSum, List<Integer> currPath,List<List<Integer>> allPaths){
        if(root == null){
            return;
        }
        //  1. If node is a leaf node i.e no left and right child and target sum is achieved 
        //      add the currentPath into all path
        //   2. Do not forget to backtrack in if statement i.e remove after adding path.
        // */
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            currPath.add(root.val);
            allPaths.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size() - 1);
            return;
        }
        
        currPath.add(root.val);
        
        pathSum(root.left, targetSum - root.val,currPath,allPaths);
        pathSum(root.right, targetSum - root.val, currPath, allPaths);
        
        currPath.remove(currPath.size() - 1);
    }
}