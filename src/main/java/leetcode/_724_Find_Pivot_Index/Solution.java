package leetcode._724_Find_Pivot_Index;

/**
 * [724. Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums. length == 0) return -1;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}