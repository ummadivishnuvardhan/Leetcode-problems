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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        
         Queue<TreeNode> q=new LinkedList<>();
         bfs(list,q,root);
         return list;
    }
    public void bfs(List<List<Integer>> list,Queue<TreeNode> q,TreeNode root){
        q.offer(root);
        
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> al=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                al.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            } 
            list.add(al);
        }
      
            Collections.reverse(list);
        
    }
}