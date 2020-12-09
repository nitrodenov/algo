package leetcode._350_Intersection_of_Two_Arrays_II;

import java.util.Arrays;

/**
 * [350. Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0
                || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[count] = nums1[i];
                i++;
                j++;
                count++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(result, count);
    }

}