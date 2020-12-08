package leetcode._3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

/**
 * [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;

        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        while (start < s.length() && end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                count = Math.max(count, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }

        return count;
    }
}