public class Node {

    Node next;
    Node prev;
    int key;
    int val;

    public Node() {
        next = null;
        prev = null;
        key = 0;
        val = 0;
    }

    public Node(int k, int v) {
        next = null;
        prev = null;
        key = k;
        val = v;
    }

    public Node(Node n, Node p, int k, int v) {
        next = n;
        prev = p;
        key = k;
        val = v;
    }

}

class LRUCache {

    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {

        Node node = map.get(key);

        if(node == null) return -1; //key not found in cache

        else {
            // move it to MRU
            deleteNode(node);
            insertAfterHead(node);
        }

        return node.val;
    }
    
    public void put(int key, int value) {

        // key already exists
        if(map.get(key)!=null) {
            Node node = map.get(key);

            // update value
            node.val = value; 

            // move it to MRU
            deleteNode(node); 
            insertAfterHead(node);

            return;
        }

        // key does not exist
        else {

            // cache is full
            if(map.size()==capacity) {

                //delete LRU
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);

            }
            
            // cache is NOT full
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertAfterHead(newNode);
        }
        
    }

    //insert after Head
    private void insertAfterHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    //delete Node
    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
