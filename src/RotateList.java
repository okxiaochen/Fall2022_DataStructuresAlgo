public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        // close the linked list
        ListNode ptr = head;
        int n = 1;
        while (ptr.next != null) {
            n++;
            ptr = ptr.next;
        }
        ptr.next = head;

        // find the k places
        int kth = n - k % n - 1;
        ptr = head;
        for (int i = 0; i < kth; i++) {
            ptr = ptr.next;
        }
        ListNode newHead = ptr.next;
        ptr.next = null;
        return newHead;

    }
}
