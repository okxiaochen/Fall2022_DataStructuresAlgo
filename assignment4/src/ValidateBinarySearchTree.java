import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (prev != null && cur.val < prev.val) {
                return false;
            }
            prev = cur;
            cur = cur.right;
        }
        return true;
    }
}
