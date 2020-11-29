package leetcode._151_Reverse_Words_in_a_String;

/**
 * [151. Reverse Words in a String] (https://leetcode.com/problems/reverse-words-in-a-string/)
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0;
        int end = 0;
        String result = "";
        while(start < s.length()) {
            while (start < s.length() && s.charAt(start) == ' ') {
                start++;
            }
            end = start;
            while(end < s.length() && s.charAt(end) != ' ') {
                end++;
            }
            result = s.substring(start, end) + " " + result;
            start = end;
        }

        return result.trim();
    }
}