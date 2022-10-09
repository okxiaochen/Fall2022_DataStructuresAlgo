class Node {
    public int val;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};

public class InsertIntoASortedCircularLinkedList {
    public Node insert(Node start, int x) {

        if (start == null) {
            Node node = new Node(x, null);
            node.next = node;
            return node;
        }

        Node p = start;
        while (true) {
            if (p.val < p.next.val) {
                if (p.val <= x && x <= p.next.val) {
                    p.next = new Node(x, p.next);
                    break;
                }
            } else if (p.val > p.next.val) {
                if (p.val <= x || x <= p.next.val) {
                    p.next = new Node(x, p.next);
                    break;
                }
            } else {
                if (p.next == start) {
                    p.next = new Node(x, p.next);
                    break;
                }
            }
            p = p.next;
        }
        return start;
    }
}
