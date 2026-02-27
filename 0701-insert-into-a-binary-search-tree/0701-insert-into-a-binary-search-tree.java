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
    public TreeNode BST(TreeNode root, TreeNode newNode){
        if(root==null){
            return newNode;
        };
        if(newNode.val<root.val){
            root.left=BST(root.left, newNode);
        }
        if(newNode.val>root.val){
            root.right=BST(root.right, newNode);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root==null) return newNode;
        return BST(root, newNode);
    }
}