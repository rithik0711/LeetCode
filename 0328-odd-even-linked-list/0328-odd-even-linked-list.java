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
    public ListNode oddEvenList(ListNode head) {
        ListNode current=head;
        ListNode result = new ListNode(0);
        ListNode tail = result;
        int i=0;
        int j=0;
        while(current!=null){
            if(i%2==0){
                tail.next=new ListNode(current.val);
                tail=tail.next;
            }
            i++;
            current=current.next;
        }
        while(head!=null){
            if(j%2!=0){
                tail.next=new ListNode(head.val);
                tail=tail.next;
            }
            j++;
            head=head.next;
        }
        return result.next;
    }
}