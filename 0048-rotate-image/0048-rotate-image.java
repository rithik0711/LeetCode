class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][len-1-j];
                matrix[i][len-1-j]=temp;
            }
        }

    }
}