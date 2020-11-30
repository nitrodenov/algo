package leetcode._144_Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalRecursive(list, root);
        return list;
    }

    private void preorderTraversalRecursive(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preorderTraversalRecursive(list, root.left);
        preorderTraversalRecursive(list, root.right);
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