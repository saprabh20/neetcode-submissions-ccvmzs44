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
        HashMap<Node, Node> hm = new HashMap<>();
        Node curr = head;
        while(curr != null) {
            Node copyNode = new Node(curr.val);
            hm.put(curr, copyNode);
            curr = curr.next;
        }
        curr = head;
        while(curr != null) {
            Node copyNode = hm.get(curr);
            copyNode.next = hm.get(curr.next);
            copyNode.random = hm.get(curr.random);
            curr = curr.next;
        }
        return hm.get(head);
    }
}
