package leetcode._54_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            // from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            // from top to bottom
            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            if (left < right && top < bottom) {
                // from right to left
                for (int i = right - 1; i > left; i--) {
                    result.add(matrix[bottom][i]);
                }

                // from bottom to top
                for (int i = bottom; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        return result;
    }
}