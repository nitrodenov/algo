package leetcode._101_Symmetric_Tree;

/**
 * [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRecursive(root, root);
    }

    private boolean isSymmetricRecursive(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;

        return (first.val == second.val)
                && isSymmetricRecursive(first.left, second.right)
                && isSymmetricRecursive(first.right, second.left);
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