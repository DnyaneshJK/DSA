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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        
        ListNode prev1 = null;
        ListNode l = head;
        ListNode r = head;

        while(left>1){
            prev1=l;
            l=l.next;
            left--;
        }
          while(right>1){
            r=r.next;
            right--;
        }
        ListNode af = r.next;
        ListNode prev = af;
        ListNode curr = l;
        while(curr!=af){
            ListNode next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        
        if(prev1!=null) {prev1.next=r;}
        else{
            head=r;
        }

        return head;
    }
}