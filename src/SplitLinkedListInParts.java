public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode p = root;
        int n = 0;
        while (p != null) {
            p = p.next;
            n++;
        }

        int width = n / k;
        int remainder = n % k;

        ListNode[] ans = new ListNode[k];
        p = root;
        for (int i = 0; i < k; i++) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            for (int j = 0; j < width + (i < remainder ? 1 : 0); j++) {
                curr.next = new ListNode(p.val);
                curr = curr.next;
                p = p.next;
            }
            ans[i] = dummyHead.next;
        }
        return ans;
    }
}
