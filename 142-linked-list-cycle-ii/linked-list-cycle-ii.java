/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=null;
        ListNode q=head;
        boolean isCycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p=slow;
                isCycle=true;
                break;
            }
        }
        while(isCycle){
             if(p==q){
                return p;
            }
            q=q.next;
            p=p.next;
        }
        return null;
    }
}