class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
            next = null;
            prev = null;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size || index<0)
            return -1;
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;

    }

    public void addAtHead(int val) {
        ListNode temp = head;
        ListNode node = new ListNode(val);
        if(size==0){
            head=node;
            tail=node;
            size++;
        }else{

        temp.prev = node;
        node.next = temp;
        head = node;
        size++;
        }
    }

    public void addAtTail(int val) {
        ListNode temp = tail;
        ListNode node = new ListNode(val);
        if(size==0){
            head=node;
            tail=node;
        }else{
            node.prev = temp;
        temp.next = node;
        tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if (index<0 || index > size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
            
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        node.prev = temp.prev;
        node.next = temp;
        temp.prev.next = node;
        temp.prev=node;
        size++;

    }

       public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;
        if (index == 0) {

            head = head.next;

            if (head != null)
                head.prev = null;
            else
                tail = null;

            size--;
            return;
        }

        if (index == size - 1) {

            tail = tail.prev;

            if (tail != null)
                tail.next = null;
            else
                head = null;

            size--;
            return;
        }

        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */