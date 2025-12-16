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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        List<Double> list = new ArrayList<>();
        while(!que.isEmpty()){
            int size = que.size();
            double sum=0;
            for(int num=0;num<size;num++){
                TreeNode curr_node=que.poll();
                sum+=curr_node.val;
                if(curr_node.left!=null)
                    que.add(curr_node.left);
                if(curr_node.right!=null)
                    que.add(curr_node.right);
            }
            list.add(sum/size);
        }
        return list;
    }
}