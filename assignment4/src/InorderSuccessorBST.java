import java.util.Stack;

public class InorderSuccessorBST {
    public TreeNode solve(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (pre != null && pre.val == p.val) {
                return cur;
            }
            pre = cur;
            cur = cur.right;
        }
        return null;
    }
}
