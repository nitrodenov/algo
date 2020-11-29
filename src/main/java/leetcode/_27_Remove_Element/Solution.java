package leetcode._27_Remove_Element;

/**
 * [27. Remove Element](https://leetcode.com/problems/remove-element/)
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}