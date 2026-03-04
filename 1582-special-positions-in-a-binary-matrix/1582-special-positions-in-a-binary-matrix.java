class Solution {
    public boolean ConditionMatrix(int[][] mat, int row, int col){
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]==1 && i!=col) return false;
        }
        for(int j=0;j<mat.length;j++){
            if(mat[j][col]==1 && j!=row) return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(ConditionMatrix(mat, i , j)) count++;
                }
            }
        }
        return count;
    }
}