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
    public boolean isValidBST(TreeNode root) {
        boolean res=bst(root);
        return res;
    }
    public boolean bst(TreeNode root){
        if(root==null){
            return  false;
        }
        if(root.left!=null){
            if(root.val>root.left.val){
                bst(root.left);
            }
            else return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val){
                bst(root.right);
            }
            else return false;
        }
        return true;
    }
}