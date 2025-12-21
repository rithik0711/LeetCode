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
    public List<Integer> RightSideNodes(TreeNode root){
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            for(int i=0;i<size;i++){
                TreeNode curr_node = que.poll();
                if(i==size-1){
                    result.add(curr_node.val);
                }
                if(curr_node.left!=null) que.add(curr_node.left);
                if(curr_node.right!=null) que.add(curr_node.right);
            }
            
        }
        return result;
    }
    public List<Integer> rightSideView(TreeNode root) {
        return RightSideNodes(root);
    }
}