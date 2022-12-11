package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solve(arr));
    }

    // time complexity: O(NKlogK) N is the length of strs, and K is the maximum lenght of a string in strs
    // space complexity: O(NK)
    public static List<List<String>> solve(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str :
                strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if (!hm.containsKey(sortedStr)) {
                hm.put(sortedStr, new ArrayList<>());
            }
            hm.get(sortedStr).add(str);
        }
        List<List<String>> ret = new ArrayList<>(hm.values());
        return ret;
    }
}
