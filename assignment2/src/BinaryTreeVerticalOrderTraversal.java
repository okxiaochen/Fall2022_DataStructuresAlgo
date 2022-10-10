import javafx.util.Pair;

import java.util.*;

// https://leetcode.com/problems/binary-tree-vertical-order-traversal/
public class BinaryTreeVerticalOrderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> columnTable = new HashMap<>();
        int maxColumn = 0, minColumn = 0;
        int column = 0;
        queue.offer(new Pair<>(root, column));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> p = queue.poll();
            TreeNode node = p.getKey();
            column = p.getValue();

            if (node == null) continue;

            if (!columnTable.containsKey(column)) {
                columnTable.put(column, new ArrayList<>());
            }

            columnTable.get(column).add(node.val);
            minColumn = Math.min(minColumn, column);
            maxColumn = Math.max(maxColumn, column);

            queue.offer(new Pair<>(node.left, column - 1));
            queue.offer(new Pair<>(node.right, column + 1));
        }

        for (int i = minColumn; i <= maxColumn; ++i) {
            ret.add(columnTable.get(i));
        }

        return ret;
    }
}
