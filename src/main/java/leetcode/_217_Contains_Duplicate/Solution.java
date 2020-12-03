package leetcode._217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}