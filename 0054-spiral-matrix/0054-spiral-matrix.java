class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> al=new ArrayList<>();
        int rowB=0,rowE=mat.length-1,colB=0,colE=mat[0].length-1;
        while(rowB<=rowE&&colB<=colE){
            for(int i=colB;i<=colE;i++){
                al.add(mat[rowB][i]);
            }   
            rowB++;
            for(int i=rowB;i<=rowE;i++){
                al.add(mat[i][colE]);
            }
            colE--;
            if(rowB<=rowE){
                for(int i=colE;i>=colB;i--){
                    al.add(mat[rowE][i]);
                }
            }
            rowE--;
            if(colB<=colE){
                for(int i=rowE;i>=rowB;i--){
                    al.add(mat[i][colB]);
                }
            }
            colB++;
        }
        return al;
    }
}