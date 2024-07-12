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
    private int answer = 0;
    private int search(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = search(root.left);
        int right = search(root.right);
        
        answer = Math.max(answer, left + right);
        return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        search(root);
        return answer;
    }
}
