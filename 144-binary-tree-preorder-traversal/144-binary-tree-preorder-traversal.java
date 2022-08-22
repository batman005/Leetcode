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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
         if(root == null)return ans;
        ArrayDeque<TreeNode>stack =  new ArrayDeque();
stack.push(root);
while(!stack.isEmpty()){
    TreeNode pop = stack.pop();
    ans.add(pop.val);
    if(pop.right!=null){
        stack.push(pop.right);
}
    
    if(pop.left!=null){
           stack.push(pop.left);
   }
}
     
return ans;
    }
}