import java.util.ArrayList;
import java.util.Objects;

public class SerializeAndDeserializeBST {
    // Encodes a tree to a single string.
    int idx = 0;
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        return deserialize(nodes);
    }

    private TreeNode deserialize(String[] nodes) {
        if (nodes[idx].equals("#")) {
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[idx++]));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}
