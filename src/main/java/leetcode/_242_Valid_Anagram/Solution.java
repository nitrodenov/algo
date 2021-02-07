package leetcode._242_Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            int firstCount = 1;
            if (map1.containsKey(first)) {
                firstCount = map1.get(first) + 1;
            }
            map1.put(first, firstCount);

            int secondCount = 1;
            if (map2.containsKey(second)) {
                secondCount = map2.get(second) + 1;
            }
            map2.put(second, secondCount);
        }

        return map1.equals(map2);
    }
}