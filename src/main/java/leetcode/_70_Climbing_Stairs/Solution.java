package leetcode._70_Climbing_Stairs;

/**
 * [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
 */
public class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        return climbStairsRecursion(0, n, cache);
    }

    private int climbStairsRecursion(int reachedCount, int n, int[] cache) {
        if (reachedCount > n) {
            return 0;
        }
        if (reachedCount == n) {
            return 1;
        }
        if (cache[reachedCount] > 0) {
            return cache[reachedCount];
        }


        cache[reachedCount] = climbStairsRecursion(reachedCount + 2, n, cache) + climbStairsRecursion(reachedCount+1, n, cache);

        return cache[reachedCount];
    }
}