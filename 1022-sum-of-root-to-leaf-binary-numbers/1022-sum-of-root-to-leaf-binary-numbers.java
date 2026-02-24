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
    public int convertBinarytoInteger(int num){
        int power=0;
        int decimal=0;
        while(num>0){
            int lastdigit=num%10;
            decimal+=lastdigit*Math.pow(2, power);
            num/=10;
            power++;
        }
        return decimal;
    }
    public int DFS(TreeNode node, int currSum){
        if(node==null) return 0;
        currSum=currSum*2+node.val;
        if(node.left==null && node.right==null){
            return currSum;
        }
        return DFS(node.left, currSum) + DFS(node.right, currSum);
    }
    public int sumRootToLeaf(TreeNode root) {
        return DFS(root, 0);
    }
}