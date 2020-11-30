package leetcode._66_Plus_One;

/**
 * [66. Plus One](https://leetcode.com/problems/plus-one/)
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int one = 1;

        for (int i = digits.length-1; i >= 0; i--) {
            int element = digits[i] + one;
            if (element / 10 == 0) {
                result[i] = element;
                one = 0;
            } else {
                result[i] = 0;
                one = 1;
            }
        }
        if (one == 1) {
            int[] oneMoreResult = new int[digits.length + 1];
            oneMoreResult[0] = 1;
            return oneMoreResult;
        }
        return result;
    }
}