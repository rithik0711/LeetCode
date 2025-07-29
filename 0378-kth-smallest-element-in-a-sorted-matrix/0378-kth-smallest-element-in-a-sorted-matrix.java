class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        int a=0;
        int[] res = new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[a++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}