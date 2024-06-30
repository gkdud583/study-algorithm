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
    private int getDepth(TreeNode root) {
        int left = 0, right = 0;
        if (root.left != null) {
            left = getDepth(root.left); //2
        }
        if (root.right != null) {
            right = getDepth(root.right);
        }
        System.out.println(root.val + " " + left + " " + right);
        return Math.max(left, right) + 1;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getDepth(root);
    }
}
