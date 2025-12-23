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
    public int LevelSum(TreeNode root){
        List<List<Integer>> main_list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr_node = que.poll();
                list.add(curr_node.val);
                if(curr_node.left!=null)
                    que.add(curr_node.left);
                if(curr_node.right!=null)
                    que.add(curr_node.right);
            }
            main_list.add(list);
        }
        int lar=Integer.MIN_VALUE;
        int find=0;
        for(int i=0;i<main_list.size();i++){
            int sum=0;
            for(int j=0;j<main_list.get(i).size();j++){
                sum+=main_list.get(i).get(j);
            }
            if(sum>lar){
                lar=sum;
                find=i+1;
            }
        }
        return find;
    }
    public int maxLevelSum(TreeNode root) {
        return LevelSum(root); 
    }
}