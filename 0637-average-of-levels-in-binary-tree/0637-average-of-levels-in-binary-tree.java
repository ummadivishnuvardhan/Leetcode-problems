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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        bfs(root,list,q);
        return list;
    }
    public void bfs(TreeNode root,List<Double> list,Queue<TreeNode> q){
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
          
            List<Integer> al=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                if(curr!=null){
                al.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                }
            }
            Double sum=0.0;
            for(int i=0;i<al.size();i++){
                sum+=al.get(i);
            }
            list.add(sum/al.size());
        }
    }
}