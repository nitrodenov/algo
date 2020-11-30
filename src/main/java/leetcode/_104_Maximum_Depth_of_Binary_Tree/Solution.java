package leetcode._104_Maximum_Depth_of_Binary_Tree;

/**
 * [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepthRecursive(0, root);
    }

    public int maxDepthRecursive(int depth, TreeNode root) {
        if (root == null) return depth;
        int left = maxDepthRecursive(depth, root.left);
        int right = maxDepthRecursive(depth, root.right);
        return Math.max(left, right) + 1;
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