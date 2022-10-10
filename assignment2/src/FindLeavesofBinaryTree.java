import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-leaves-of-binary-tree/
public class FindLeavesofBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        level(ret, root);
        return ret;

    }

    public int level(List<List<Integer>> ret, TreeNode node) {
        if (node == null) return -1;

        int level = Math.max(level(ret, node.left), level(ret, node.right)) + 1;

        if (ret.size() <= level) {
            ret.add(new ArrayList<>());
        }
        ret.get(level).add(node.val);
        return level;
    }
}
