class Solution {
    public boolean checkXMatrix(int[][] grid) {
        return diagonal(grid);
    }
    public boolean diagonal(int[][] grid){
        boolean set=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==j || grid.length-i-1==j){
                    if(grid[i][j]!=0) set=true;
                    else return false;
                }
                else{
                    if(grid[i][j]==0) set=true;
                    else return false;
                }
            }
        }
        return set==true;
    }
}