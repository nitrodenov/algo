package leetcode._136_Single_Number;

/**
 * [136. Single Number](https://leetcode.com/problems/single-number/)
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}