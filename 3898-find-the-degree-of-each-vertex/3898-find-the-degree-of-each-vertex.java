class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                if(i!=j){
                    if(matrix[i][j]==1){
                        count+=1;
                    }
                }
            }
            res[i]=count;
        }
        return res;
    }
}