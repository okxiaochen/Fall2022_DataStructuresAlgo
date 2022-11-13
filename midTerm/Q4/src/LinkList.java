public class LinkList {

    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public void insert(Integer data) {
        // Insert in sorted manner
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (curr.data > data) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prev != null) {
            Node insertNode = new Node(data);
            prev.next = insertNode;
            insertNode.next = curr;
            length++;
        }
    }
}