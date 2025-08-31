class Solution {

    int n = 3;
    int N = n * n;
    int[][] rows = new int[N][N + 1];
    int[][] cols = new int[N][N + 1];
    int[][] boxes = new int[N][N + 1];
    char[][] board;
    boolean solved = false;

    public void solveSudoku(char[][] board) {
        this.board = board;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(board[i][j] != '.') {
                    placeNumber(Character.getNumericValue(board[i][j]), i, j);
                }
            }
        }
        backtrack(0, 0);
    }

    public boolean couldPlace(int d, int row, int col) {
        int boxIndex = (row / n) * n + col / n;
        return rows[row][d] + cols[col][d] + boxes[boxIndex][d] == 0;
    }

    public void placeNextNumbers(int row, int col) {
        if(row == N - 1 && col == N - 1) solved = true;
        else if(col == N - 1) backtrack(row + 1, 0);
        else backtrack(row, col + 1);
    }

    public void backtrack(int row, int col) {
        if(board[row][col] == '.') {
            for(int d = 1; d <= 9; d++) {
                if(couldPlace(d, row, col)) {
                    placeNumber(d, row, col);
                    placeNextNumbers(row, col);
                    if(!solved) removeNumber(d, row, col);
                }
            }
        } else {
            placeNextNumbers(row, col);
        }
    }

    public void removeNumber(int d, int row, int col) {
        int boxIndex = (row / n) * n + col / n;
        rows[row][d]--;
        cols[col][d]--;
        boxes[boxIndex][d]--;
        board[row][col] = '.';
    }

    public void placeNumber(int d, int row, int col) {
        int boxIndex = (row / n) * n + col / n;
        rows[row][d]++;
        cols[col][d]++;
        boxes[boxIndex][d]++;
        board[row][col] = (char) (d + '0');
    }
}