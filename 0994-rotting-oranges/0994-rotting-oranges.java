class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0,timetaken=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(grid[i][j]==1){
                        fresh++;
                    }
                    else if(grid[i][j]==2){
                        q.offer(new int[]{i,j,0});
                    }
            }
        }
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0],y=curr[1],time=curr[2];
            timetaken=time;
            for(int[] dir:directions){
                int nx=dir[0]+x,ny=dir[1]+y;
                while(nx>=0&&ny>=0&&nx<m&&ny<n&&grid[nx][ny]==1){
                    fresh--;
                    grid[nx][ny]=2;
                    q.offer(new int[]{nx,ny,time+1});
                }
            }
        }
        if(fresh==0){
            return timetaken;
        }
        return -1;
    }
}