/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private boolean check(Set<Integer> visited, ListNode head) {
        if (visited.contains(head.hashCode())) {
            return true;
        }
        if (head.next == null) {
            return false;
        }
        visited.add(head.hashCode());
        return check(visited, head.next);
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<Integer> visited = new HashSet<>();
        return check(visited, head);
    }
}
