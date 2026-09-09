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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode sl = dummy;
        ListNode fa = dummy;

        while(n>0){
            fa = fa.next;
            n--;
        }

        while(fa!=null && fa.next!=null){
            sl = sl.next;
            fa=fa.next;
        }

        sl.next=sl.next.next;

        return dummy.next;
    }
}