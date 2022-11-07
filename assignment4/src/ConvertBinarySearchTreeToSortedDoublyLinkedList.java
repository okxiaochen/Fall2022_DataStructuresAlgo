class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

public class ConvertBinarySearchTreeToSortedDoublyLinkedList {
    Node dummyHead;
    Node cur;
    Node pre;

    public ConvertBinarySearchTreeToSortedDoublyLinkedList() {
        dummyHead = new Node();
        cur = dummyHead;
        pre = null;
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        pre = cur;
        cur = new Node(root.val);
        pre.right = cur;
        cur.left = pre;
        inorder(root.right);
    }
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        inorder(root);
        Node head = dummyHead.right;
        cur.right = head;
        head.left = cur;
        return head;
    }
}
