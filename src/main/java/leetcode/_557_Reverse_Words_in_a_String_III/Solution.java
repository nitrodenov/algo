package leetcode._557_Reverse_Words_in_a_String_III;

/**
 * [557. Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return "";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().append(" ").toString());
        }
        return sb.toString().trim();
    }
}