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
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        ListNode p=null;
        while(node!=null){
            ListNode next=node.next;
            node.next=p;
            p=node;
            node=next;
        }
        head=p;
        return head;



        
        

       

        
    }
}