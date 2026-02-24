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
    public int DFS(TreeNode root, int currSum){
        if(root==null) return 0;//base case
        currSum=currSum*10+root.val;
        if(root.left==null && root.right==null){
            return currSum;
        }
        return DFS(root.left, currSum) + DFS(root.right, currSum);//recursive case
    }
    public int sumNumbers(TreeNode root) {
        return DFS(root, 0);
    }
}