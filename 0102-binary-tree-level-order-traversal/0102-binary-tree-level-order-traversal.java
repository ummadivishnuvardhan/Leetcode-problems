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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        return bfs(list,root,q);
    }
    public List<List<Integer>> bfs(List<List<Integer>> list,TreeNode root,Queue<TreeNode> q){
        if(root==null){
            return list;
        }
        while(!q.isEmpty()){
            int level=q.size();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                al.add(curr.val);
                if(curr!=null){
                    if(curr.left!=null) q.offer(curr.left);
                    if(curr.right!=null) q.offer(curr.right);
                }
            }
            list.add(al);
        }
        return list;
    }
}