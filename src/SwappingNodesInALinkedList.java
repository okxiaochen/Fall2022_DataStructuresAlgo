public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode p = head;
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        while (p != null) {
            if (++n == k) {
                left = p;
            }
            p = p.next;
        }
        int rightK = n - k + 1;
        p = head;
        n = 0;
        while (p != null) {
            if (++n == rightK) {
                right = p;
                break;
            }
            p = p.next;
        }
        int t = left.val;
        left.val = right.val;
        right.val = t;
        return head;
    }
}
