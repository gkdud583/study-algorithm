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
    //d == 1, left / d == 2, right
    public int calculate(TreeNode root, int d) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            if (d == 1) {
                return root.val;
            }
        }

        return calculate(root.left, 1) + calculate(root.right, 2);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return calculate(root, 0);
    }
}
