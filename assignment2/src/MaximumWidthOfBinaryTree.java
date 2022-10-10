import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/maximum-width-of-binary-tree/
public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));
        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int startIdx = queue.peek().getValue();
            int endIdx = startIdx;
            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> p = queue.poll();
                TreeNode node = p.getKey();
                endIdx = p.getValue();
                if (node.left != null) queue.add(new Pair<>(node.left, endIdx * 2));
                if (node.right != null) queue.add(new Pair<>(node.right, endIdx * 2 + 1));
            }
            maxWidth = Math.max(maxWidth, endIdx - startIdx + 1);
        }

        return maxWidth;
    }

}
