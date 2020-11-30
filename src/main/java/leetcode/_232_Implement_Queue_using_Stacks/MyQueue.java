package leetcode._232_Implement_Queue_using_Stacks;

import java.util.Stack;

/**
 * [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
 */
public class MyQueue {

    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        Integer result = temp.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return result;
    }

    /** Get the front element. */
    public int peek() {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        Integer result = temp.peek();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */