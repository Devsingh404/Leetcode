class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[] ans = new int[1];
        int di[] = {1,0,0,-1};
        int dj[] = {0,-1,1,0};

        int cells = 0;
        int Srow = 0;
        int Scol = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(grid[i][j] == 0)cells++;
                if(grid[i][j] == 1){
                    Srow = i;
                    Scol = j;
                }
            }
        }
        cells++;
        helper( grid , cells , ans , Srow , Scol , di , dj);

        return ans[0];
    }

    public void helper(int[][] grid , int cells , int[] ans ,int row , int col , int[] di , int[] dj){
        if(grid[row][col] == 2){
            if(cells == 0) ans[0]++;
            return ;
        }
        if(cells == 0) return;

        grid[row][col] = -1;

        for(int i=0 ; i<4 ; i++){
            int nrow = row + di[i];
            int ncol = col + dj[i];
            if(isSafe(grid.length , grid[0].length , nrow , ncol) && grid[nrow][ncol] != -1){
                helper(grid , cells-1 , ans , nrow , ncol , di , dj);
            }
        }
        grid[row][col] = 0;
    }

    public boolean isSafe(int row , int col , int i , int j){
        return i >= 0 && j >= 0 && i < row && j < col;
    }
}
