package leetcode._234_Palindrome_Linked_List;

/**
 * [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHead = slow.next;
        slow.next = null;

        ListNode current = null;
        ListNode next = secondHead;

        // reverse from middle to end
        while (next != null) {
            ListNode tempNext = next.next;
            next.next = current;
            current = next;
            next = tempNext;
        }

        ListNode first = head;
        ListNode second = current;

        while (second != null) {
            if (first.val == second.val) {
                first = first.next;
                second = second.next;
            } else {
                return false;
            }
        }

        return true;

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