public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode curr = head;
        ListNode prev = dummyHead;
        while (curr != null) {
            if (curr.val != val) {
                prev = curr;
                curr = curr.next;
            } else {
                curr = curr.next;
                prev.next = curr;
            }
        }
        return dummyHead.next;


    }
}
