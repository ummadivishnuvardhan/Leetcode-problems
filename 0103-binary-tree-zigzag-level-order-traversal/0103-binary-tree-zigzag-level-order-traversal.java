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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque<TreeNode> q=new ArrayDeque<>();
        bfs(list,root,q);
        return list;
    }
    public void bfs(List<List<Integer>> list,TreeNode root,Deque<TreeNode> q){
        q.offer(root);
       boolean res=false;
        while(!q.isEmpty()){
            
            int level=q.size();
            List<Integer> al=new ArrayList<>();

            for(int i=0;i<level;i++){
                
                if(res){
                    TreeNode curr=q.removeFirst();
                    if(curr!=null){
                        al.add(curr.val);
                        if(curr.right!=null) q.addLast(curr.right);
                        if(curr.left!=null) q.addLast(curr.left);
                    
                    }
                }
                else{
                    TreeNode curr=q.removeLast();
                    if(curr!=null){
                        al.add(curr.val);     
                       
                         if(curr.left!=null) q.addFirst(curr.left);
                        if(curr.right!=null) q.addFirst(curr.right);
                    
                    }
                }
           
              
            }
             res=!res;
            list.add(al);
          
           
        }
    }
 
}