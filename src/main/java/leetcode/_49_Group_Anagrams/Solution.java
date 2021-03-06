package leetcode._49_Group_Anagrams;

import java.util.*;

/**
 * [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }

        return new ArrayList(map.values());
    }
}