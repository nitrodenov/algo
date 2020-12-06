package leetcode._205_Isomorphic_Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);

            if (map.containsKey(first)) {
                if (map.get(first) != second) {
                    return false;
                }
            } else {
                map.put(first, second);
            }
        }

        Set<Character> set = new HashSet<>(map.values());
        if (set.size() != map.values().size()) {
            return false;
        }

        return true;
    }
}