package leetcode._349_Intersection_of_Two_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0
                || nums2 == null || nums2.length == 0) {
            return new int[0];
        }


        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        for (Integer num : nums1) {
            first.add(num);
        }
        for (Integer num : nums2) {
            second.add(num);
        }
        if (first.size() > second.size()) {
            return setIntersection(first, second);
        } else {
            return setIntersection(second, first);
        }
    }

    private int[] setIntersection(Set<Integer> big, Set<Integer> small) {
        int[] result = new int[small.size()];
        int count = 0;

        for (int num : small) {
            if (big.contains(num)) {
                result[count++] = num;
            }
        }

        return Arrays.copyOf(result, count);
    }
}