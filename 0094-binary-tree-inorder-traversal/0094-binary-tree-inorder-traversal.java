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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(list,root);
        return list;
    }
     public void inOrder(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
         inOrder(list,root.left);
        list.add(root.val);
       
        inOrder(list,root.right);
    }
}