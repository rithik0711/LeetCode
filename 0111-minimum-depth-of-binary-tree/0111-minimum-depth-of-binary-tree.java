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
    public int minDepth(TreeNode root) {
        return Height(root);
    }
    public int Height(TreeNode node){
        if(node==null) return 0;
        if(node.left==null) return Height(node.right)+1;
        if(node.right==null) return Height(node.left)+1;
        return Math.min(Height(node.right),Height(node.left))+1;
    }
}