package leetcode._1470_Shuffle_the_Array;

/**
 * [1470. Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        int position = 0;

        for (int i = 0; i < n; i++) {
            result[position] = nums[i];
            result[position+1] = nums[n+i];
            position = position + 2;
        }

        return result;
    }
}