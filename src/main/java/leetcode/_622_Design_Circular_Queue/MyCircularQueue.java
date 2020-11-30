package leetcode._622_Design_Circular_Queue;

import java.util.Arrays;

/**
 * [622. Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
 */
public class MyCircularQueue {

    private int[] arr;
    private int head;
    private int tail;
    private int capacity;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr = new int[k];
        head = 0;
        tail = 0;
        capacity = k;
        Arrays.fill(arr, -1);
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) return false;

        arr[tail++] = value;
        if (tail == capacity) {
            tail = 0;
        }

        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;

        arr[head++] = -1;
        if (head == capacity) {
            head = 0;
        }

        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) return -1;
        return arr[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) return -1;

        if (tail == 0) {
            return arr[capacity - 1];
        } else {
            return arr[tail - 1];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == tail && arr[tail] == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return head == tail && arr[tail] != -1;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */