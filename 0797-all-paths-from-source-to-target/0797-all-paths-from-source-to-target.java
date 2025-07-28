class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, 0, path, result);
        return result;
    }
    public void dfs(int[][] graph,int curr,List<Integer> path,List<List<Integer>> result){
        path.add(curr);
        if(curr==graph.length-1){
            result.add(new ArrayList<>(path));
           
        }
        else{
            for(int next:graph[curr]){
                dfs(graph,next,path,result);
            }
        }
        path.remove(path.size()-1);
    }
}