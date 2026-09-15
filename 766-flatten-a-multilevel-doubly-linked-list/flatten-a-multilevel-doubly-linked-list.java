/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node ch = flatten(curr.child);
                curr.next = ch;
                ch.prev=curr;
                curr.child = null;
                Node temp = ch;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=next;
                if(next!=null) next.prev=temp;
            }

            curr = curr.next;
        }
            return head;
    }
}