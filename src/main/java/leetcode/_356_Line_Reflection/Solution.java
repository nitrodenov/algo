package leetcode._356_Line_Reflection;

import java.util.HashSet;
import java.util.Set;

/**
 * [356. Line Reflection] (https://leetcode.com/problems/line-reflection/)
 * <p>
 * #yandex
 * 1) Вычислить hash (int, int) -> int. Добавить в Set
 * 2) Найти середину по x
 * 3) Найти отображение всех точек по x
 * 4) Убедиться, то hash отображения есть в Set
 */
public class Solution {
    public boolean isReflected(int[][] points) {
        Integer minX = Integer.MAX_VALUE;
        Integer maxX = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            set.add(hash(x, y));
            minX = Math.min(x, minX);
            maxX = Math.max(x, maxX);
        }

        float middleX = minX + (maxX - minX) / 2.0f;

        for (int[] point : points) {
            float x = (float) point[0];
            int y = point[1];
            boolean isRightSide = x > middleX;

            float opositeX;
            if (isRightSide) {
                float distanceToCenter = x - middleX;
                opositeX = middleX - distanceToCenter;
            } else {
                float distanceToCenter = middleX - x;
                opositeX = middleX + distanceToCenter;
            }

            int opositeY = y;
            int newPointHash = hash((int) opositeX, opositeY);
            if (!set.contains(newPointHash)) {
                return false;
            }
        }

        return true;
    }

    private int hash(int first, int second) {
        int hash = 7;
        hash = hash * 31 + first;
        hash = hash * 31 + second;
        return hash;
    }
}