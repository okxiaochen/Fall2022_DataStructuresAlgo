import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node<Integer> root = getBST();
        int[] range = {1, 8};
        ArrayList<Integer> results = new ArrayList<>();
        recursion(root, range[0], range[1], results);
        System.out.println(results);
    }

    private static void recursion(Node<Integer> node, int min, int max, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }
        if (node.data > max) {
            recursion(node.left, min, max, res);
        }
        else if (node.data < min) {
            recursion(node.right, min, max, res);
        }
        else {
            res.add(node.data);
            recursion(node.left, min, max, res);
            recursion(node.right, min, max, res);
        }
    }

    // Given range between 5 and 8 it will print 6, 8
    private static Node<Integer> getBST(){
        Node<Integer> root = new Node<>(8);
        root.parent = root;

        root.left = new Node<>(3);
        root.right = new Node<>(10);
        root.left.parent = root;
        root.right.parent = root;


        root.left.left = new Node<>(1);
        root.left.right = new Node<>(6);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.right.right = new Node<>(14);
        root.right.right.parent = root.right;

        root.left.right.left = new Node<>(4);
        root.left.right.right = new Node<>(17);
        root.left.right.left.parent = root.left.right;
        root.left.right.right.parent = root.left.right;


        root.right.right.left = new Node<>(13);
        root.right.right.left.parent = root.right.right;



        return root;
    }

}