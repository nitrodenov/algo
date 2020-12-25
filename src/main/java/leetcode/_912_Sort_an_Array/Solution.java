package leetcode._912_Sort_an_Array;

import java.util.Arrays;

/**
 * [912. Sort an Array](https://leetcode.com/problems/sort-an-array/)
 */
class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSortSplitting(nums);
    }

    private int[] mergeSortSplitting(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int pivot = nums.length / 2;

        int[] left = mergeSortSplitting(Arrays.copyOfRange(nums, 0, pivot));
        int[] right = mergeSortSplitting(Arrays.copyOfRange(nums, pivot, nums.length));

        return mergeSorting(left, right);
    }

    private int[] mergeSorting(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftCursor = 0;
        int rightCursor = 0;
        int resultCursor = 0;

        while (leftCursor < left.length && rightCursor < right.length) {
            if (left[leftCursor] < right[rightCursor]) {
                result[resultCursor++] = left[leftCursor++];
            } else {
                result[resultCursor++] = right[rightCursor++];
            }
        }

        while (leftCursor < left.length) {
            result[resultCursor++] = left[leftCursor++];
        }

        while (rightCursor < right.length) {
            result[resultCursor++] = right[rightCursor++];
        }

        return result;
    }
}