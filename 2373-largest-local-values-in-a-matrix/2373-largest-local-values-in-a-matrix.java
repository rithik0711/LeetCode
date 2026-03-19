class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length-2;
        int n=grid[0].length-2;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int max=0;
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        max=Math.max(max,grid[x][y]);
                    }
                }
                res[i][j]=max;
            }
        }
        return res;
    }
}