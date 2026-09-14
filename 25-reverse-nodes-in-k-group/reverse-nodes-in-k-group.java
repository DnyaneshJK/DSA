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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        ListNode temp=head;
        int n=0;
        ListNode ans=null;
        ListNode prev=null;
        int p1=1;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int z=n/k;
        while(z>0){
           ListNode temp1=cur;
           int a=k;
           while(a>1 && temp1!=null){
            temp1=temp1.next;
            a--;
           }
           ListNode ng = temp1.next;
           temp1.next=null;
           ListNode p = reverse(cur);
           if(p1==1){
           p1=2; 
           ans=p;
           } 
           if(prev!=null){
            prev.next=p;
           }
           cur.next=ng;
           prev=cur;
           cur=ng;
           z--;
        }
        return ans;
    }
}