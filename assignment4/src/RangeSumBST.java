public class RangeSumBST {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sumBST(root, low, high);
        return sum;
    }

    private void sumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        sumBST(root.left, low, high);
        if (root.val < low) {
            sumBST(root.right, low, high);
        } else if (root.val <= high) {
            sum += root.val;
            sumBST(root.right, low, high);
        }
    }
}
