/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node curr = dummy;
        HashMap<Node,Node> map = new HashMap<>();
        Node a = head;
        while(head!=null){
            Node n = new Node(head.val);
            map.put(head,n);
            curr.next=n;
            curr=curr.next;
            head=head.next;
        }

        Node c = dummy.next;
        while(a!=null){
            c.random = map.get(a.random);
            a=a.next;
            c=c.next;
        }

        return dummy.next;
    }
}