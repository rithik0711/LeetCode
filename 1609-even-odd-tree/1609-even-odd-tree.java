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
    public boolean EvenOddTree(TreeNode root){
        if(root.val%2==0) return false;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean even_level = true;
        while(!que.isEmpty()){
            int size = que.size();
            int prev = even_level ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0;i<size;i++){   
            TreeNode curr_node = que.poll();
                if(even_level){
                    if(curr_node.val%2==0 || curr_node.val<=prev) return false;
                }
                else{
                    if(curr_node.val%2!=0 || curr_node.val>=prev) return false;
                }
                prev=curr_node.val;
                if(curr_node.left!=null) que.add(curr_node.left);
                if(curr_node.right!=null) que.add(curr_node.right);
            }
            even_level = !even_level;
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        return EvenOddTree(root);
    }
}