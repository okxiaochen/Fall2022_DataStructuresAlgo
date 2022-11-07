import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTreeIterator {
    private TreeNode cur;
    private Stack<TreeNode> stack;
    public BinarySearchTreeIterator(TreeNode root) {
        this.cur = root;
        this.stack =  new Stack<>();
    }

    public int next() {
        int ret = 0;
        if (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ret = cur.val;
            cur = cur.right;
        }
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }

}
