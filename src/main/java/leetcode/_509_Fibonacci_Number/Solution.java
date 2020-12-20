package leetcode._509_Fibonacci_Number;

import java.util.HashMap;
import java.util.Map;

/**
 * [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
 */
public class Solution {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int current = 0;
        int prev0th = 0;
        int prev1th = 1;

        for (int i = 2; i <= n; i++) {
            current = prev0th + prev1th;
            prev0th = prev1th;
            prev1th = current;
        }

        return current;
    }

    public int fibWithMemoization(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n <= 1) {
            result = n;
        } else {
            result = fib(n-1) + fib(n-2);
        }

        cache.put(n, result);

        return result;
    }

    public int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int current = 0;
        int prev0th = 0;
        int prev1th = 1;

        for (int i = 2; i <= n; i++) {
            current = prev0th + prev1th;
            prev0th = prev1th;
            prev1th = current;
        }

        return current;
    }

    public int fibGoldenRatio(int n) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(goldenRatio, n)/ Math.sqrt(5));
    }
}