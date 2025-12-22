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
import java.util.*;
class Solution {
    public List<List<Integer>> BFS(TreeNode root, List<List<Integer>> main_list){
        if(root==null) return main_list;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr_node = que.poll();
                if(curr_node==null){
                    list.add(01);//due to add 0 for both null & 0 -> I fixed as 01
                    continue;
                }
                list.add(curr_node.val);
                que.add(curr_node.left);
                que.add(curr_node.right);
            }
            main_list.add(list);
        }
        return main_list;
    }
    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> list1 = BFS(root.left, new ArrayList<>());
        List<List<Integer>> list2 = BFS(root.right, new ArrayList<>());
        for(int i=0;i<list2.size();i++){
            Collections.reverse(list2.get(i));
        }
        return list1.equals(list2);
    }
}