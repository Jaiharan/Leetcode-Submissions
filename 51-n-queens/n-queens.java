class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solve(board, 0, ans);
        return ans;
    }

    void solve(boolean[][] board, int row, List<List<String>> ans) {
        // base case
        if(row == board.length) {
            ans.add(createBoard(board));
            return;
        }
        for(int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                // find for next row
                solve(board, row + 1, ans);
                // Backtrack
                board[row][col] = false;
            }
        }
    }

    boolean isSafe(boolean[][] board, int row, int col) {
        // check for |
        for(int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }
        // check /
        for(int i = 1; i <= row && col - i >= 0; i++) {
            if(board[row - i][col - i]) return false;
        }
        // check \
        for (int i = 1; i <= row && col + i < board.length; i++) {
            if (board[row - i][col + i]) return false;
        }

        // its safe
        return true;
    }

    List<String> createBoard(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for(boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for(boolean el : row) {
                sb.append( el ? "Q" : ".");
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}