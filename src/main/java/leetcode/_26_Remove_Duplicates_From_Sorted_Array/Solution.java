package leetcode._26_Remove_Duplicates_From_Sorted_Array;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int nextIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[nextIndex]) {
                nums[++nextIndex] = nums[i];
            }
        }
        return nextIndex + 1;
    }
}
