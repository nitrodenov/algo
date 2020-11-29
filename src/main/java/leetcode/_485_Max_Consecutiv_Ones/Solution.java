package leetcode._485_Max_Consecutiv_Ones;

/**
 * [485. Max Consecutive Ones] (https://leetcode.com/problems/max-consecutive-ones/)
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempResult = 0;
        int result = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length || nums[i] == 0) {
                if (tempResult > result) {
                    result = tempResult;
                }
                tempResult = 0;
            } else {
                tempResult++;
            }
        }
        return result;
    }
}