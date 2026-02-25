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
    public void DFS(TreeNode node, List<String> list, String path){
        if(node==null) return ;
        if(path.isEmpty()){
            path=String.valueOf(node.val);
        }
        else{
            path=path+"->"+String.valueOf(node.val);
        }
        if(node.left==null && node.right==null){
            list.add(path);
            return ;
        }
        DFS(node.left, list, path);
        DFS(node.right, list, path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root==null) return list;
        DFS(root, list, "");
        return list;
    }
}