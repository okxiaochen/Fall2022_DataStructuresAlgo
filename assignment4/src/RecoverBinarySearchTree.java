public class RecoverBinarySearchTree {
    TreeNode x = null;
    TreeNode y = null;
    TreeNode prev = null;

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        if (prev != null && prev.val > node.val) {
            y = node;
            if (x == null) {
                x = prev;
            }
        }
        prev = node;

        dfs(node.right);
    }

    public void recoverTree(TreeNode root) {
        dfs(root);
        if (x != null && y != null) {
            int t = y.val;
            y.val = x.val;
            x.val = t;
        }
    }
}
