package leetcode._394_Decode_String;

import java.util.Stack;

/**
 * [394. Decode String](https://leetcode.com/problems/decode-string/)
 */
public class Solution {
    public String decodeString(String s) {
        if (s == null || s.isEmpty()) return "";

        Stack<Integer> numStack = new Stack<>();
        Stack<String> valStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int currentIndex = 0;

        while (currentIndex < s.length()) {
            if (Character.isDigit(s.charAt(currentIndex))) {
                int num = 0;
                while (Character.isDigit(s.charAt(currentIndex))) {
                    num = num * 10 + Integer.parseInt(String.valueOf(s.charAt(currentIndex)));
                    currentIndex++;
                }
                numStack.push(num);
            } else if (s.charAt(currentIndex) == '[') {
                valStack.push(sb.toString());
                sb = new StringBuilder();
                currentIndex++;
            } else if (s.charAt(currentIndex) == ']') {
                StringBuilder temp = new StringBuilder(valStack.pop());
                int num = numStack.pop();
                for (int j = 0; j < num; j++) {
                    temp.append(sb.toString());
                }
                sb = temp;
                currentIndex++;
            } else {
                sb.append(s.charAt(currentIndex++));
            }
        }
        return sb.toString();
    }

}