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

        Node ptr = head;

        Map<Node, Node> hm = new HashMap<>();
        hm.put(null, null);

        while(ptr!=null) {
            Node copy = new Node(ptr.val);
            hm.put(ptr, copy);
            ptr = ptr.next;
        }

        ptr = head;
        while(ptr!=null) {
            Node copy = hm.get(ptr);
            copy.next = hm.get(ptr.next);
            copy.random = hm.get(ptr.random);
            ptr = ptr.next;
        }

        return hm.get(head);
        
    }
}
