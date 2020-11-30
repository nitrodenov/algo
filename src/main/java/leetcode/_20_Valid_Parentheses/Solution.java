package leetcode._20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return false;

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char stackC = stack.pop();
                if (c == '}' && stackC == '{'
                        || c == ')' && stackC == '('
                        || c == ']' && stackC == '[') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}