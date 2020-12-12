package leetcode._219_Contains_Duplicate_II_Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * [219. Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}