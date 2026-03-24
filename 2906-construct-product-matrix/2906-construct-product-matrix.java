class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int size = m * n;
        int mod = 12345;

        int[] arr = new int[size];
        
        // Flatten
        int idx = 0;
        for(int[] row : grid){
            for(int val : row){
                arr[idx++] = val % mod;
            }
        }

        // Prefix
        int[] prefix = new int[size];
        prefix[0] = 1;
        for(int i=1;i<size;i++){
            prefix[i] = (prefix[i-1] * arr[i-1]) % mod;
        }

        // Suffix
        int[] suffix = new int[size];
        suffix[size-1] = 1;
        for(int i=size-2;i>=0;i--){
            suffix[i] = (suffix[i+1] * arr[i+1]) % mod;
        }

        // Build result
        int[][] res = new int[m][n];
        idx = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = (prefix[idx] * suffix[idx]) % mod;
                idx++;
            }
        }

        return res;
    }
}