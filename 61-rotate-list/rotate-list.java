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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==0) return null;
        k=k%c;
        int a=k;
        ListNode slow=head;
        ListNode fast=head;
        while(a>0){
            fast=fast.next;
            a--;
        }
        a=k;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next=null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        }

        while(a>0){
            ListNode n = prev.next;
            prev.next=head;
            head=prev;
            prev=n;
            a--;
        }
        return head;
    }
}