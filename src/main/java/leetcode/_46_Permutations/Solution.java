package leetcode._46_Permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [46. Permutations](https://leetcode.com/problems/permutations/)
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> numsList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        permute(nums.length, numsList, result, 0);

        return result;
    }

    private void permute(int n,
                         List<Integer> nums,
                         List<List<Integer>> result,
                         int first) {
        if (n == first) {
            result.add(new ArrayList<Integer>(nums));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            permute(n, nums, result, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}