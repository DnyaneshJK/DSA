class LRUCache {

        class Node{
            int key;
            int val;
            Node prev;
            Node next;
            Node(int key,int val){
                this.key=key;
                this.val = val;
            }
        }

            int cap;
            Node head=null;
            Node tail=null;
            HashMap<Integer,Node> map  = new HashMap<>();
    
        public LRUCache(int capacity){
            this.cap = capacity; 
        }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node n = map.get(key);
        int a = n.val;
        if(n!=tail){
            if(n==head){
                head=n.next;
                head.prev=null;
            } else{
                n.prev.next=n.next;
                n.next.prev=n.prev;
            }
          n.next=null;
          tail.next=n;
          n.prev=tail;
          tail=n;
        }

        return a;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            n.val=value;
            if(n!=tail){
            if(n==head){
                head=n.next;
                head.prev=null;
            } else{
                n.prev.next=n.next;
                n.next.prev=n.prev;
            }
          n.next=null;
          tail.next=n;
          n.prev=tail;
          tail=n;

        }

        } else{
            Node b = new Node(key,value);
            if(head==null){
                head=b;
                tail=b;
            }
            map.put(key,b);
            if (head == null) {
                head = b;
                tail = b;
            } else {
                tail.next = b;
                b.prev = tail;
                tail = b;
            }
            map.put(key,b);
        }

        if(map.size()>cap){
            Node r = head;
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            map.remove(r.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */