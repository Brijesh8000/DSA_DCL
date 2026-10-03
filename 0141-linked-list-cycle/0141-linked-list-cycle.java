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
        List<ListNode> li =new ArrayList<>();
        ListNode node=head;
        if(node==null){
            return false;
        }
        while(node!=null){
            if(li.contains(node)){
                return true;
            }
            li.add(node);
            node=node.next;
        }
        return false;
    }
}