package leetcode._430_Flatten_a_Multilevel_Doubly_Linked_List;

/**
 * [430. Flatten a Multilevel Doubly Linked List](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/)
 */
class Solution {
    public Node flatten(Node head) {
        flattenRecoursive(head);
        return head;
    }

    private Node flattenRecoursive(Node head) {
        if (head == null) return null;

        if (head.child == null) {
            if (head.next == null) {
                return head;
            } else {
                return flattenRecoursive(head.next);
            }
        } else {
            Node child = head.child;
            head.child = null;
            Node next = head.next;
            Node childTail = flattenRecoursive(child);
            head.next = child;
            child.prev = head;

            if (next == null) {
                return childTail;
            } else {
                childTail.next = next;
                next.prev = childTail;
                return flattenRecoursive(next);
            }
        }

    }

    private static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}