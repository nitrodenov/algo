package leetcode._380_Insert_Delete_GetRandom;

import java.util.*;

/**
 * [380. Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/)
 */
public class RandomizedSet {

    private Random rand;
    private Map<Integer, Integer> map;
    private List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        rand = new Random();
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);

        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            Integer indexToRemove = map.get(val);
            Integer lastListElement = list.get(list.size() - 1);

            list.set(indexToRemove, lastListElement);
            list.remove(list.size() - 1);

            map.put(lastListElement, indexToRemove);
            map.remove(val);

            return true;
        }

        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */