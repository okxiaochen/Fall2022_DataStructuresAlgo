public class LinkList {

    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    // time complexity: O(N)
    // space complexity: O(1)
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