package leetcode._209_Minimum_Size_Subarray_Sum;

/**
 * [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
 */
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int sum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }

        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}