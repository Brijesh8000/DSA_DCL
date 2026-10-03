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
    public boolean hasCycle(ListNode head) {
         Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (!seen.add(head)) return true; // add() returns false if already present
            head = head.next;
        }
        return false;
    }
}