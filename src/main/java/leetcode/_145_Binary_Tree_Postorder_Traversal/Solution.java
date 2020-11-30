package leetcode._145_Binary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversalRecursive(list, root);
        return list;
    }

    private void postorderTraversalRecursive(List<Integer> list, TreeNode root) {
        if (root == null) return;
        postorderTraversalRecursive(list, root.left);
        postorderTraversalRecursive(list, root.right);
        list.add(root.val);
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