import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class ConvertSortedListToBinarySearchTree {
    private ArrayList<Integer> linkedList2Array(ListNode head) {
        ArrayList<Integer> ret = new ArrayList<>();
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = linkedList2Array(head);
        return buildBST(arr, 0, arr.size() - 1);

    }

    private TreeNode buildBST(List<Integer> arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = buildBST(arr, left, mid - 1);
        root.right = buildBST(arr, mid + 1, right);
        return root;
    }
}
