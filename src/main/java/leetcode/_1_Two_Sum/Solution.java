package leetcode._1_Two_Sum;

import java.util.HashMap;
import java.util.Map;

/**
 * [1. Two Sum](https://leetcode.com/problems/two-sum/)
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for( int i = 0; i < nums.length; i++) {
            int substraction = target - nums[i];
            if (map.containsKey(substraction)) {
                return new int[] { map.get(substraction), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}