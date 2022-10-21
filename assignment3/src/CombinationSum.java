import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, 0, target, result, new ArrayList<>());
        return result;
    }

    private void combinationSum(int[] candidates, int start, int remaining, List<List<Integer>> ans, List<Integer> combination) {

        if (start == candidates.length || remaining < 0) {
            return;
        }

        if (remaining == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            combinationSum(candidates, i, remaining - candidates[i], ans, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
