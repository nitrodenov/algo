package leetcode._206_Reverse_Linked_List;

/**
 * [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = null;
        ListNode next = head;
        while (next != null) {
            ListNode newNext = next.next;
            next.next = current;
            current = next;
            next = newNext;
        }
        return current;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}