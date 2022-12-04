package Q2;

public class Main {


    public static void main(String[] args) {
        IdenticalTree it = new IdenticalTree();
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        System.out.println(it.isSame(p, q));

        q = new Node(1);
        q.left = new Node(2);

        p = new Node(1);
        p.right = new Node(2);

        System.out.println(it.isSame(p, q));

        q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(1);

        p = new Node(1);
        p.left = new Node(1);
        p.right = new Node(2);

        System.out.println(it.isSame(p, q));
    }
}
