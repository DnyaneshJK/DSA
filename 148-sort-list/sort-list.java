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


    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow=head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null) prev.next=null;
        head = sortList(head);
        slow = sortList(slow);
        ListNode ans = merge(head,slow);
        return ans;
    }
}

// class Solution {
//     public ListNode sortList(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         ArrayList<Integer> al = new ArrayList<>();
//         while(head!=null){
//             al.add(head.val);
//             head=head.next;
//         }
//         Collections.sort(al);

//         for(int num : al){
//             curr.next = new ListNode(num);
//             curr=curr.next;
//         }
//         return dummy.next;
//     }
// }