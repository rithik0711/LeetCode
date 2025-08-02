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
import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode tail = result;
        StringBuilder str = new StringBuilder();
        while(head!=null){
            str.append(head.val);
            head=head.next;
        }
        BigInteger num = new BigInteger(str.toString());
        BigInteger pro = num.multiply(BigInteger.valueOf(2));
        StringBuilder fin = new StringBuilder(String.valueOf(pro));
        for(int i=0;i<fin.length();i++){
            tail.next=new ListNode(fin.charAt(i)-'0');
            tail=tail.next;
        }
        return result.next;
    }
}