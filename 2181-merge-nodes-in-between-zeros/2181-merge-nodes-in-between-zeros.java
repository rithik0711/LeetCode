/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;//first node is 0
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        int sum=0;
        while(current!=null){
            if(current.val!=0){
                sum+=current.val;
            }
            else{
                result.next=new ListNode(sum);
                result=result.next;
                sum=0;
            }
            current=current.next;
        }
        return temp.next;
    }
}