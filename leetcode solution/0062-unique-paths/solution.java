class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                dp[i][j] = -1;
            }
        }
        return helper(dp, 0, 0, m, n);
    }

    public int helper(int[][] dp ,int row , int col , int m , int n){
        if(row>=m || col>=n) return 0;
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(dp[row][col] != -1) return dp[row][col];
        int right = helper(dp , row+1 , col , m , n);
        int down = helper(dp , row , col+1 , m , n);

        dp[row][col] = right + down;
        return dp[row][col];
    }
}
