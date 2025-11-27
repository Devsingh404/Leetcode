class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        if(word.length() > m*n) return false;
        int[][] vis = new int[n][m];

        int di[] = {1,0,0,-1};
        int dj[] = {0,-1,1,0};
        boolean found = false;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(board , word , i , j , 0 , di , dj)) return true;

                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board , String word ,int row , int col , int index ,int[] di ,int[] dj){
        if (board[row][col] != word.charAt(index)) return false;
        if(index == word.length()-1) return true;
            
        char temp = board[row][col];
        board[row][col] = '#';

        for (int k = 0; k < 4; k++) {
            int nrow = row + di[k];
            int ncol = col + dj[k];

            if (isSafe(board.length, board[0].length, nrow, ncol)) {
                if (board[nrow][ncol] != '#') {
                    if (helper(board, word, nrow, ncol, index + 1, di, dj)) {
                        board[row][col] = temp;
                        return true;
                    }
                }
            }
        }
        board[row][col] = temp;
        return false;
    }

    public boolean isSafe(int row , int col , int i , int j){
        return i >= 0 && j >= 0 && i < row && j < col;
    }
}
