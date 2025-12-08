class Solution {
    public boolean Check_knight_tour(int[][] grid, int knight_row, int knight_col){
        if(grid[knight_row][knight_col]==(grid.length*grid.length)-1) return true;
        int[][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
        int tot_row = grid.length;
        int tot_col = grid[0].length;
        for(int i=0;i<dir.length;i++){
            int curr_row = knight_row + dir[i][0];
            int curr_col = knight_col + dir[i][1];
            if(curr_row<tot_row && curr_row>=0 && curr_col<tot_col && curr_col>=0 && grid[curr_row][curr_col]==grid[knight_row][knight_col]+1){
                boolean ret_val = Check_knight_tour(grid, curr_row, curr_col);
                return ret_val;
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        else if(Check_knight_tour(grid, 0, 0)) return true;
        return false;
    }
}