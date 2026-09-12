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
    public ListNode partition(ListNode head, int x) {
        ListNode l = head;
        ListNode curr=null;
        ListNode first=null;
        ListNode m =null;
        ListNode m1 =null;
        while(l!=null){
            if(l.val<x){
                if(curr==null){
                    curr=l;
                    first=l;
                }else{
                curr.next=l;
                curr=l;
                }
            }
            
            else{
                if(m==null){
                    m=l;
                    m1=m;
                } else{
                    m.next=l;
                    m=l;
                }
            }

            l=l.next;
        }
        if(curr==null) return m1;
        curr.next=m1;
        if(m!=null) m.next=null;
        return first;

    }
}