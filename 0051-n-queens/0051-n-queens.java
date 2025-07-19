class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        List<String> al=new ArrayList<>();
        if(n==1){
            al.add("Q");
            list.add(al);
            return list;
        }
        char[][] nQueens=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(nQueens[i],'.');
        }
        solve(n,list,nQueens,0);
        return list;
    }

    public void solve(int n,List<List<String>> list,char[][] nQueens,int row){
        //Base Case:If all rows contain a Queen,then our output is correct
        if(row==n){
            List<String> solution=new ArrayList<>();
            for(int i=0;i<n;i++){
                solution.add(new String(nQueens[i]));
            }
            list.add(solution);
            return;
        }

        for(int col=0;col<n;col++){
            if(isSafe(n,nQueens,row,col)){
                nQueens[row][col]='Q';
                solve(n,list,nQueens,row+1);
                nQueens[row][col]='.';
            }
        }
    }



    public boolean isSafe(int n,char[][] nQueens,int row,int col){
        //If there is a Queen in a same column
        for(int i=0;i<n;i++){
            if(nQueens[i][col]=='Q'){
                return false;
            }
        }
        //If there is a Queen in the upper left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
              if(nQueens[i][j]=='Q'){
                return false;
            }
        }
        //If there is a Queen in the Upper right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
             if(nQueens[i][j]=='Q'){
                return false;
            }
        }
        //If no Attacks are found,This position is safe
        return true;

    }
}