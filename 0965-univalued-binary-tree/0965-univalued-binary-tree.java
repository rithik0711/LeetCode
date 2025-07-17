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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return false;
        return checkUnique(root,root.val);
    }
    public boolean checkUnique(TreeNode root, int val){
        if(root==null) return true;
        if(root.val!=val) return false;
        return checkUnique(root.left,val) && checkUnique(root.right,val);
    }
}