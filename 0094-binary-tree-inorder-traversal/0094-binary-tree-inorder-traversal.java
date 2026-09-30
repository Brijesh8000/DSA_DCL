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
     
    public static void display(TreeNode  node,List<Integer> li){
        if(node==null){
            return;
        }
        display(node.left,li);
            li.add(node.val);
            display(node.right,li);

        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> li=new ArrayList<>();
        TreeNode node=root;
        display(node,li);


        
        return li;
    }
}