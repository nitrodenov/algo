package leetcode._21_Merge_Two_Sorted_Lists;

/**
 * [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        ListNode first = l1;
        ListNode second = l2;
        while (first != null && second != null) {
            if (first.val < second.val) {
                result.next = first;
                first = first.next;
            } else {
                result.next = second;
                second = second.next;
            }
            result = result.next;
        }

        if (first != null) {
            result.next = first;
        }

        if (second != null) {
            result.next = second;
        }

        return head.next;
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