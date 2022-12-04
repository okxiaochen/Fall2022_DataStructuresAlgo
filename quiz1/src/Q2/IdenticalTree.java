package Q2;

public class IdenticalTree {

    public boolean isSame(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.value != q.value)
            return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
