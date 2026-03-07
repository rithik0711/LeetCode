class Solution {
    public int checkRow(int[][] grid, int i){
        int count=0;
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1) count++;
        }
        return count;
    }
    public int checkCol(int[][] grid, int j){
        int count=0;
        for(int i=0;i<grid.length;i++){
            if(grid[i][j]==1) count++;
        }
        return count;
    }
    public int countServers(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int row = checkRow(grid, i);
                    int col = checkCol(grid, j);
                    if(row>1 || col>1) count++;
                }
            }
        }
        return count;
    }
}