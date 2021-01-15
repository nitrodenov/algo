package leetcode._13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 * [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
 * <p>
 * #facebook
 */
public class Solution {

    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Character lastChar = chars[chars.length - 1];
        int lastValue = map.get(lastChar);
        int total = lastValue;

        for (int i = chars.length - 2; i >= 0; i--) {
            int currentValue = map.get(chars[i]);
            if (currentValue < lastValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            lastValue = currentValue;
        }

        return total;
    }
}