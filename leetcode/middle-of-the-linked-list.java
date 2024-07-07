/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class Solution {
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int mid = list.size() / 2;

        int j = 0;
        while (head != null) {
            if (j == mid) {
                return head;
            }
            head = head.next;
            j++;
        }
        return head;
    }
}
