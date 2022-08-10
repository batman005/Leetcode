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
    class Node{
        int low ,up;
        TreeNode t;
        Node(int l, int p, TreeNode node){
            low = l;
            up = p;
            t = node;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        Stack<Node> stack = new Stack<Node>();
          // initialize
        TreeNode root = new TreeNode(nums[(nums.length-1)/2]);
        Node rootNode = new Node(0,nums.length-1,root);
        stack.push(rootNode);
        //iteration
        while(!stack.isEmpty()){
            Node node = stack.pop();
            int middle = (node.low+ node.up)/2; //cut jalf for[low,up]
            //[low, middle - 1]
            if(middle - 1 >= node.low){
                TreeNode leftnode = new TreeNode(nums[(middle - 1 + node.low )/ 2]);
                node.t.left = leftnode;
                Node left = new Node(node.low, middle - 1, leftnode);
                stack.push(left);
            }
            //[middle + 1, up]
            if(middle + 1 <= node.up){
                TreeNode rightnode = new TreeNode(nums[(middle + 1 + node.up) / 2]);
                node.t.right = rightnode;
                Node right = new Node(middle + 1, node.up, rightnode);
                stack.push(right);
            }
        }
        return root;
    }
}