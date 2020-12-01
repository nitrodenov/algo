package leetcode._119_Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.List;

/**
 * [119. Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/submissions/)
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastList = new ArrayList<>();
        if (rowIndex <= 0) {
            lastList.add(1);
            return lastList;
        }

        lastList.add(1);
        List<Integer> newList = new ArrayList<>();

        for (int i = 1; i <= rowIndex; i++) {
            newList.add(1);
            for (int j = 1; j < i; j++) {
                newList.add(lastList.get(j-1) + lastList.get(j));
            }
            newList.add(1);
            lastList = newList;
            newList = new ArrayList<>();
        }

        return lastList;
    }
}