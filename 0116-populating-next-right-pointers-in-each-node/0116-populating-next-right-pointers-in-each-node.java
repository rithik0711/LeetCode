/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node BFS(Node root){
        if(root==null) return root;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            Node prev=null;
            for(int i=0;i<size;i++){
                Node curr_node = que.poll();
                if(prev!=null){
                    prev.next=curr_node;
                }
                if(curr_node.left!=null){
                    que.add(curr_node.left);
                }
                if(curr_node.right!=null){
                    que.add(curr_node.right);
                }
                prev=curr_node;
                prev.next=null;
            }
        }
        return root;
    }
    public Node connect(Node root) {
        return BFS(root);
    }
}