package Q3;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        String s = "lee(t(c)o)de)";
        String s = "))((";
        System.out.println(getValidString(s));
    }

    // time complexity:  O(n)
    // space complexity: O(n)
    public static String getValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> indexes2remove = new HashSet<>();
        // O(n)
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    indexes2remove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        indexes2remove.addAll(stack);
        StringBuilder sb = new StringBuilder();
        // O(n)
        for (int i = 0; i < s.length(); i++) {
            if (indexes2remove.contains(i)) continue;
            sb.append(s.charAt(i));
        }

        // O(n)
        return sb.toString();
    }
}
