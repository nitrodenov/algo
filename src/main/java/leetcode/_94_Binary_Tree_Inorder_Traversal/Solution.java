package leetcode._94_Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalRecursive(list, root);
        return list;
    }

    private void inorderTraversalRecursive(List<Integer> list, TreeNode root) {
        if (root == null) return;
        inorderTraversalRecursive(list, root.left);
        list.add(root.val);
        inorderTraversalRecursive(list, root.right);
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