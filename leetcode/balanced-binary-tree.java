/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int search(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = search(root.left);
        int rightDepth = search(root.right);
        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        }
        int result = Math.abs(leftDepth - rightDepth);
        if (result > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int result = search(root);
        if (result == -1) {
            return false;
        }
        return true;
    }
}
