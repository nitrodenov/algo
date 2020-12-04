package leetcode._202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

/**
 * [202. Happy Number](https://leetcode.com/problems/happy-number/)
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            set.add(n);
            n = getSum(n);
            if (n == 1) {
                return true;
            }
        }

        return false;
    }
    private int getSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}