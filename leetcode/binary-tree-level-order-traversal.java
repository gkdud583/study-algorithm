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
    private void search(Map<Integer, List<Integer>> map, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        List<Integer> list;
        if (!map.containsKey(level)) {
            list = new LinkedList<>();
        } else {
            list = map.get(level);
        }

        if (root.left != null) {
            list.add(root.left.val);
        }
        if (root.right != null) {
            list.add(root.right.val);
        }
        map.put(level, list);
        search(map, root.left, level + 1);
        search(map, root.right, level + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> answer = new LinkedList<>();
        map.put(0, Arrays.asList(root.val));
        search(map, root, 1);
        for( Integer key : map.keySet() ){
            List<Integer> val = map.get(key);
            answer.add(val);
        }
        return answer;
    }
}
