package Q3;

import java.util.*;

public class BinTree<T> {
    public Node<T> root;

    public BinTree() {

    }

    public List<List<Integer>> levelOrder() {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node<T> node = queue.remove();
                level.add((Integer) node.data);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }
}