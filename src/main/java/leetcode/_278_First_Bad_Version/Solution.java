package leetcode._278_First_Bad_Version;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/**
 * [278. First Bad Version](https://leetcode.com/problems/first-bad-version/)
 */
public class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int middle) {
        return false;
    }
}