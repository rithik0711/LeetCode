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
    public List<Integer> ElementList(TreeNode root, List<Integer> list){
        if(root==null) return list;
        if(root!=null) list.add(root.val);
        if(root.left!=null) ElementList(root.left, list);
        if(root.right!=null) ElementList(root.right, list);
        return list;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if(root1!=null) ElementList(root1, list);
        if(root2!=null) ElementList(root2, list);
        Collections.sort(list);
        return list;
    }
}