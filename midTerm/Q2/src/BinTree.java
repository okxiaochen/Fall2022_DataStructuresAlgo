import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinTree <T> {
    public Node<T> root;

    public BinTree() {

    }

    /*
     * Time Complexity: O(N) N means the numbers of the nodes
     * */
    public void populateParent() {
        preorder(root);
    }

    private void preorder(Node<T> node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            node.left.parent = node;
        }
        if (node.right != null) {
            node.right.parent = node;
        }
        preorder(node.left);
        preorder(node.right);
    }
}