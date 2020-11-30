package leetcode._747_Largest_Number_At_Least_Twice_of_Others;

/**
 * [747. Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int maxIndex = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && 2 * nums[i] > max) return -1;
        }

        return maxIndex;
    }
}