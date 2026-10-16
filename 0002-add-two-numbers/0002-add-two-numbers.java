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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode list=result;
        int carry=0;
        

        while(l1!=null || l2!=null || carry!=0){
            int value1=(l1!=null)? l1.val:0;
            int value2=(l2!=null)? l2.val:0;
            int total =value1+value2+carry;
            carry=total/10;
            list.next=new ListNode(total%10);
            list=list.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

            
        }
        return result.next;
        
    }
}