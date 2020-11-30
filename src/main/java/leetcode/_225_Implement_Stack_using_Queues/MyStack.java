package leetcode._225_Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)
 */
public class MyStack {

    Queue<Integer> queue;
    int top;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        int result = -1;
        while (!queue.isEmpty()) {
            result = queue.remove();
            if (queue.peek() != null) {
                top = result;
                temp.add(result);
            }
        }
        queue = temp;

        return result;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */