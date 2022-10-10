import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return recursiveMaxDepth(root);
        // return iterationMaxDepth(root);
    }

    // approach 1 recursion
    private int recursiveMaxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = recursiveMaxDepth(node.left);
        int right = recursiveMaxDepth(node.right);
        return Math.max(left, right) + 1;
    }

    // approach 2 interation
    private int iterationMaxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}