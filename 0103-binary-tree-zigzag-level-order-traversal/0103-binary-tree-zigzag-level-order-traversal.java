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
    public List<List<Integer>> ZigZagTraversal(TreeNode root){
        List<List<Integer>> main_list = new ArrayList<>();
        if(root==null) return main_list;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr_node = que.poll();
                list.add(curr_node.val);
                if(curr_node.left!=null) que.add(curr_node.left);
                if(curr_node.right!=null) que.add(curr_node.right);
            }
            main_list.add(list);
        }
        // int num=2;
        for(int i=0;i<main_list.size();i++){
            if(i%2!=0){
                List<Integer> list = main_list.get(i);
                Collections.reverse(list);
            }
            // num+=2;
        }
        return main_list;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return ZigZagTraversal(root);
    }
}