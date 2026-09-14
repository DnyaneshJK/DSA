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

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            } else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }

        if(l1!=null){
            curr.next=l1;
        } else{
            curr.next=l2;
        }

        return dummy.next;

    }

    public ListNode mergeKLists(ListNode[] lists) {
       int k = lists.length;   
       if(k==0) return null;
       if(k==1) return lists[0];
       ListNode result = merge(lists[0],lists[1]);
       for(int i=2;i<k;i++){
        result = merge(result,lists[i]);
       }
       return result;
    }
}