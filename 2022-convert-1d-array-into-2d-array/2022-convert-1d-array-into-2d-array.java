class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        if(original.length!=m*n) return new int[0][0];
        for(int i=0;i<original.length;i++){
            arr[i/n][i%n]=original[i];
        }
        return arr;
    }
}