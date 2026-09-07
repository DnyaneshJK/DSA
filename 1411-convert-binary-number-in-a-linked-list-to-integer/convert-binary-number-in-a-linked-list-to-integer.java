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
    public int getDecimalValue(ListNode head) {
        int ans=0;

        while(head!=null){
            ans=head.val+2*ans;
            head=head.next;
        }
        return ans;
        
    }
}

// class Solution {
//     public int getDecimalValue(ListNode head) {
//         StringBuilder sb = new StringBuilder();
//         ListNode curr = head;
//         while(curr!=null){
//             sb.append(curr.val);
//             curr=curr.next;
//         }

//         int ans = Integer.parseInt(sb.toString(),2);

//         return ans;
//     }
// }