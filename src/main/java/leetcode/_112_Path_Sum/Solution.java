package leetcode._112_Path_Sum;

/**
 * [112. Path Sum](https://leetcode.com/problems/path-sum/)
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.left == null && root.right == null) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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