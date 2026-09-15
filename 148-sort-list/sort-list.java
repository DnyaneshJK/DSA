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
    public ListNode sortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ArrayList<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        Collections.sort(al);

        for(int num : al){
            curr.next = new ListNode(num);
            curr=curr.next;
        }
        return dummy.next;
    }
}