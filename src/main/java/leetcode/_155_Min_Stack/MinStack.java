package leetcode._155_Min_Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [155. Min Stack](https://leetcode.com/problems/min-stack/)
 */
public class MinStack {

    private Integer min;
    private List<Integer> elements;

    /** initialize your data structure here. */
    public MinStack() {
        elements = new ArrayList<>();
    }

    public void push(int x) {
        elements.add(x);
        if (min == null || min > x) min = x;
    }

    public void pop() {
        if (elements.isEmpty()) {
            return;
        }
        int value = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        if (elements.isEmpty()) {
            min = null;
            return;
        }
        if (min == value) {
            min = Collections.min(elements);
        }
    }

    public int top() {
        return elements.get(elements.size() - 1);
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */