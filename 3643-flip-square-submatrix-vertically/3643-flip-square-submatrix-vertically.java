class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;

        // Copy grid
        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = grid[i][j];
            }
        }

        // Vertical flip of k x k submatrix
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                res[x + i][y + j] = grid[x + (k - 1 - i)][y + j];
            }
        }

        return res;
    }
}