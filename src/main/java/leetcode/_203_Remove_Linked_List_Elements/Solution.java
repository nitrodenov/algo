package leetcode._203_Remove_Linked_List_Elements;

/**
 * [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        ListNode result = current;
        while (current != null) {
            if (current.val == val) {
                if (prev == null) {
                    result = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }

        return result;
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