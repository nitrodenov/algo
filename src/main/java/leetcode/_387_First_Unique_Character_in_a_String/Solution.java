package leetcode._387_First_Unique_Character_in_a_String;

import java.util.HashMap;
import java.util.Map;

/**
 * [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)
 */
public class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}