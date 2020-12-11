package leetcode._347_Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> map.get(n1) - map.get(n2));

        for (int i : map.keySet()) {
            heap.add(i);
            if (heap.size() > k) heap.poll();
        }

        int result[] = new int[k];
        for (int i = k-1; i >=0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}