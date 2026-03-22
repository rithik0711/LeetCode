class Solution {
    public int[][] RotationMatrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=mat[n-i-1][j];
            }
        }
        return res;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat==target){
            return true;
        }
        for(int i=0;i<4;i++){
            if(Arrays.deepEquals(mat, target))
                return true;
            else
                mat=RotationMatrix(mat);
        }
        return false;
    }
}