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
        Queue<TreeNode> q=new LinkedList<>();
        
        return bfs(list,root,q);
    }
    public List<List<Integer>> bfs(List<List<Integer>> list,TreeNode root,Queue<TreeNode> q){
        int temp=0;
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
            if(temp%2==1){
                Collections.reverse(al);
            }
            list.add(al);
            temp=temp+1;
        }
        return list;
    }
 
}