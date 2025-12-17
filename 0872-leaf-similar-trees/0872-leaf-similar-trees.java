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
    public List<Integer> LeafNodes_root(TreeNode root, List<Integer> list){
        if(root==null) return list;
        else if(root.left==null && root.right==null) list.add(root.val);
        LeafNodes_root(root.left,list);
        LeafNodes_root(root.right,list);
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> res_list1 = LeafNodes_root(root1,list1);
        List<Integer> res_list2 = LeafNodes_root(root2,list2);
        return res_list1.equals(res_list2);
    }
}