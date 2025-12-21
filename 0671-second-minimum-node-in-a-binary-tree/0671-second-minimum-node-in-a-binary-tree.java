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
    public void DFS(TreeNode root, List<Integer> list){
        if(root==null) return ;
        else if(root!=null)
            list.add(root.val);
            DFS(root.left, list);
            DFS(root.right, list);
    }
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        DFS(root, list);
        Collections.sort(list);
        int first_node = list.get(0);
        for(int i=1;i<list.size();i++){
            if(!list.get(i).equals(first_node)){
                return list.get(i);
            }
        }
        return -1;
    }
}