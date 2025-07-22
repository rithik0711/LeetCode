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
    public boolean isValidBST(TreeNode root) {
        return BST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean BST(TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        boolean found1=false,found2=false;
        if(BST(root.left,min,root.val)) found1=true;
        if(BST(root.right,root.val,max)) found2=true;
        return found1 && found2;
    }
}