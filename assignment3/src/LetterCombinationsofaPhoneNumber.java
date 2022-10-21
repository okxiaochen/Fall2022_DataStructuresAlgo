import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }
        HashMap<Character, String> letters = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        List<String> ret = new ArrayList<>();
        backtrack(new StringBuffer(), 0, digits, ret, letters);
        return ret;
    }

    private void backtrack(StringBuffer comb, int start, String digits, List<String> ans, HashMap<Character, String> phoneMap) {
        if (start == digits.length()) {
            ans.add(comb.toString());
            return;
        }
        char digit = digits.charAt(start);
        String letters = phoneMap.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            comb.append(letters.charAt(i));
            backtrack(comb, start + 1, digits, ans, phoneMap);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
