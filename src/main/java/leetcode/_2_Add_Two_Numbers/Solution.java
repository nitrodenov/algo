package leetcode._2_Add_Two_Numbers;

/**
 * [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;

        int firstLength = length(first);
        int secondLength = length(second);

        boolean isMoreNine = false;
        int firstInteger = 0;
        int secondInteger = 0;

        int maxCount = Math.max(firstLength, secondLength);
        ListNode answer = new ListNode(0);
        ListNode result = answer;

        for (int i = 0; i < maxCount; i++) {
            int sum = 0;
            if (isMoreNine) {
                sum += 1;
                isMoreNine = false;
            }
            if (first != null) {
                sum += first.val;
                first = first.next;
            }
            if (second != null) {
                sum += second.val;
                second = second.next;
            }

            if (sum > 9) {
                isMoreNine = true;
                sum = sum % 10;
            }
            result.next = new ListNode(sum);
            result = result.next;
        }

        if (isMoreNine) {
            result.next = new ListNode(1);
            result = result.next;
        }

        return answer.next;

    }

    private int length(ListNode n) {
        int length = 0;
        ListNode node = n;
        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }

    private ListNode rotate(ListNode node) {
        ListNode first = null;
        ListNode second = node;

        while (second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }

        return first;
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