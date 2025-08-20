class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    
                    if(i-1>=0&&j-1>=0){
                        int x=res[i-1][j];
                        int y=res[i][j-1];
                        int z=res[i-1][j-1];
                        int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);

                        res[i][j]=min+1;
                    }
                    else{
                        res[i][j]=1;
                    }
                    sum+=res[i][j];
                }
            }
        }
        return sum;
    }
}