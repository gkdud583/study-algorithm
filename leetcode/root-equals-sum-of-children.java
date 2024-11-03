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
    private int check(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return root.val;
        }
        int left = check(root.left);
        int right = check(root.right);
        if (left == -101 || right == -101) {
            return -101;
        }
        int sum = left + right;
        if (sum == root.val) {
            return root.val;
        } else {
            return -101;
        }
    }
    public boolean checkTree(TreeNode root) {
        int result = check(root);
        if (result == -101) {
            return false;
        }
        return true;
    }
}
