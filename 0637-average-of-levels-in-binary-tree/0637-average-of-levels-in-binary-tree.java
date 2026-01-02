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
        List<Double> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        return bfs(al,q,root);
    }

    public List<Double> bfs(List<Double> al,Queue<TreeNode> q,TreeNode root){
        while(!q.isEmpty()){
            int level=q.size();
            long sum=0;
            for(int i=0;i<level;i++){
                TreeNode curr=q.poll();
                if(curr!=null){
                    sum+=curr.val;
                    if(curr.left!=null){
                        q.offer(curr.left);
                    }
                    if(curr.right!=null){
                        q.offer(curr.right);
                    }
                }    
            }
            al.add((double)sum/level);
        }
        return al;
    }
}