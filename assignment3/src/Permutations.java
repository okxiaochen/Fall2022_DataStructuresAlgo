import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        permute(output, results, 0);
        return results;
    }

    private void permute(List<Integer> nums, List<List<Integer>> ans, int first) {
        if (first == nums.size()) {
            ans.add(new ArrayList<>(nums));
            return;
        }
        for (int i = first; i < nums.size(); i++) {
            Collections.swap(nums, first, i);
            permute(nums, ans, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}
