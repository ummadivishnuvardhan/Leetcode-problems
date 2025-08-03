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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        int childCount=0;
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
           
            for(int i=0;i<level;i++){
                 TreeNode curr=q.poll();
                int sameParent=0;
                if(curr.left!=null){
                    if(curr.left.val==x||curr.left.val==y){
                        sameParent++;
                        childCount++;
                    }
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    if(curr.right.val==x||curr.right.val==y){
                        sameParent++;
                        childCount++;
                    }
                    q.offer(curr.right);
                }
                if(sameParent==2){
                    return false;
                }
            }
            if(childCount==2){
                return true;  //That means we found x and y and there are same level and different parent
            }
            if(childCount==1){
                return false; //This means we found only 1 child in that level,so false
            }
        }
        return false; //we completed all the iterations but we did not found any child,so we return false
    }
}