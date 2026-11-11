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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;

        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        ListNode curr=prev.next;
         for(int j=0;j<right-left;j++){
            ListNode nxt=curr.next;
            curr.next=nxt.next;
            nxt.next=prev.next;
            prev.next=nxt;
         }

         return dummy.next;

    }
}