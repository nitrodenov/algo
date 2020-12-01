package leetcode._118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows <= 0) {
            return lists;
        }

        List<Integer> first = new ArrayList<>();
        first.add(1);
        lists.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = lists.get(i-1);
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 1; j < i; j++) {
                newList.add(prev.get(j-1) + prev.get(j));
            }
            newList.add(1);
            lists.add(newList);
        }

        return lists;
    }
}
