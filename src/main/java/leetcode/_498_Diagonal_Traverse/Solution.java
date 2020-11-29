package leetcode._498_Diagonal_Traverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [498. Diagonal Traverse](https://leetcode.com/problems/diagonal-traverse/)
 */
public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int length = matrix[0].length;
        int height = matrix.length;

        int count = 0;
        int[] result = new int[length * height];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length + height; i++) {
            list.clear();
            int first = i < length ? 0 : i - length + 1;
            int second = i < length ? i : length - 1;

            while (first < height && second >= 0) {
                list.add(matrix[first][second]);
                first++;
                second--;
            }

            if (i % 2 == 0) {
                Collections.reverse(list);
            }

            for (int element : list) {
                result[count++] = element;
            }
        }
        return result;
    }
}