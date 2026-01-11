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
    public TreeNode ReverseOddTree(TreeNode root) {
        if (root == null) return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> levelNodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                levelNodes.add(curr);

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            // Reverse values at odd levels
            if (level % 2 == 1) {
                int l = 0, r = levelNodes.size() - 1;
                while (l < r) {
                    int temp = levelNodes.get(l).val;
                    levelNodes.get(l).val = levelNodes.get(r).val;
                    levelNodes.get(r).val = temp;
                    l++;
                    r--;
                }
            }

            level++;
        }
        return root;
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        return ReverseOddTree(root);
    }
}