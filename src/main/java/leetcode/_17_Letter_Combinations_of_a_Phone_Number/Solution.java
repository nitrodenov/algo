package leetcode._17_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 *
 * #facebook
 */
public class Solution {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
    }

    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits != null && !digits.isEmpty()) {
            backtrack("", digits);
        }
        return result;
    }

    private void backtrack(String combination, String nextDigits) {
        if (nextDigits == null || nextDigits.isEmpty()) {
            result.add(combination);
        } else {
            String digit = nextDigits.substring(0,1);
            String letters = map.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i+1);
                backtrack(combination + letter, nextDigits.substring(1));
            }
        }
    }
}