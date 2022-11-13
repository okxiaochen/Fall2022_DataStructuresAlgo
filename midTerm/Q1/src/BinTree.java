import java.util.ArrayDeque;
import java.util.Queue;

public class BinTree <T> {
    public Node<T> root;

    public BinTree() {

    }

    /*
    * Time Complexity: O(N) N means the numbers of the nodes
    * Space Complexity: O(K) K means the max numbers of every level of nodes, which less than N
    * */
    public void populateNextRight(){
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            Node<T> prev = null;
            for (int i = 0; i < size; i++) {
                Node<T> node = queue.poll();
                node.nextLeft = prev;
                prev = node;
                if (node.left != null) {
                    queue.add(node.left);

                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}