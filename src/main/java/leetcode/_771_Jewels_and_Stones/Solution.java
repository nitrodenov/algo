package leetcode._771_Jewels_and_Stones;

import java.util.HashSet;
import java.util.Set;

/**
 * [771. Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J == null || J.isEmpty() || S == null || S.isEmpty()) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int count = 0;
        for (Character ch : J.toCharArray()) {
            set.add(ch);
        }

        for (Character ch : S.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}