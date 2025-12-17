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
    public boolean findPath(TreeNode root, int targetSum){
        if(root==null) return false;
        else if(root.left==null && root.right==null) return root.val==targetSum;
        else{
            int num=targetSum-root.val;
            return findPath(root.left, num) || findPath(root.right, num);
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findPath(root, targetSum);
    }
}