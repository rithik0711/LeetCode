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
    int totaltilt=0;
    public int findTilt(TreeNode root) {
        sumOfNode(root);
        return totaltilt;
    }
    public int sumOfNode(TreeNode node){
        if(node==null) return 0;
        int left = sumOfNode(node.left);
        int right = sumOfNode(node.right);
        int tilt=Math.abs(left-right);
        totaltilt+=tilt;
        return node.val+left+right;
    }
}