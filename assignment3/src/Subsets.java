import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        backtrack(ret, new ArrayList<>(), 0, nums);
        return ret;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> comb, int start, int[] nums) {
        ans.add(new ArrayList<>(comb));
        for (int i = start; i < nums.length; i++) {
            comb.add(nums[i]);
            backtrack(ans, comb, i + 1, nums);
            comb.remove(comb.size() - 1);
        }
    }
}
