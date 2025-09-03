class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, int ind, String word) {
        // base case
        if(ind == word.length() - 1) {
            return true;
        }
        char ch = board[i][j];
        board[i][j] = '*';
        int n = board.length, m = board[0].length;
        if(i - 1 >= 0 && board[i - 1][j] != '*' && board[i - 1][j] == word.charAt(ind + 1) && dfs(board, i - 1, j, ind + 1, word)) return true;
        if(i + 1 <= n-1 && board[i + 1][j] != '*' && board[i + 1][j] == word.charAt(ind + 1) && dfs(board, i + 1, j, ind + 1, word)) return true;
        if(j - 1 >= 0 && board[i][j - 1] != '*' && board[i][j - 1] == word.charAt(ind + 1) && dfs(board, i, j - 1, ind + 1, word)) return true;
        if(j + 1 <= m-1 && board[i][j + 1] != '*' && board[i][j + 1] == word.charAt(ind + 1) && dfs(board, i, j + 1, ind + 1, word)) return true;
        board[i][j] = ch;
        return false;
    }
}