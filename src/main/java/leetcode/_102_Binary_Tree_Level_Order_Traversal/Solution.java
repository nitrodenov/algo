package leetcode._102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> childs = new LinkedList<>();
        queue.add(root);

        while (true) {
            List<Integer> level = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) childs.offer(node.left);
                if (node.right != null) childs.offer(node.right);
            }
            result.add(level);
            if (childs.isEmpty()) return result;
            queue.addAll(childs);
            childs.clear();
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}