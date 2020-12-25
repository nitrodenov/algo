package leetcode._98_Validate_Binary_Search_Tree;

/**
 * [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }

        if ((high != null && root.val >= high) || (low != null && root.val <= low)) {
            return false;
        }

        return isValidBST(root.left, low, root.val)
                && isValidBST(root.right, root.val, high);
    }

    public class TreeNode {
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