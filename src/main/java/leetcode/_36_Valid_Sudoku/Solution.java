package leetcode._36_Valid_Sudoku;

import java.util.HashMap;
import java.util.Map;

/**
 * [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer>[] rows = new HashMap[9];
        Map<Integer, Integer>[] columns = new HashMap[9];
        Map<Integer, Integer>[] cells = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            cells[i] = new HashMap<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int num = (int) ch;
                    // i/3 даст целое число для вычисления box. Умножение на 3 даст смещение вниз
                    int cellNumber = (i/3) * 3 + j/3;
                    rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
                    columns[j].put(num, columns[j].getOrDefault(num, 0) + 1);
                    cells[cellNumber].put(num, cells[cellNumber].getOrDefault(num, 0) + 1);

                    if (rows[i].get(num) > 1 || columns[j].get(num) > 1
                            || cells[cellNumber].get(num) > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}