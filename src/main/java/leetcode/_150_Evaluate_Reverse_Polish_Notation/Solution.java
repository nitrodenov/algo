package leetcode._150_Evaluate_Reverse_Polish_Notation;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first + second);
            } else if (s.equals("-")) {
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first - second);
            } else if (s.equals("*")) {
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first * second);
            } else if (s.equals("/")) {
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}