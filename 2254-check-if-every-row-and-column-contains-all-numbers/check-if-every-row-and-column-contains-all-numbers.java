class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        boolean ans = true;

        // check row
        for(int[] row : matrix) {
            if(!checkPossible(row)) {
                return false;
            }
        }
        // Check col
        for(int j = 0; j < n; j++) {
            int[] tempCol = new int[matrix.length];
            for(int i = 0; i < n; i++) {
                tempCol[i] = matrix[i][j];
            }
            if (!checkPossible(tempCol)) { 
                return false;
            }
        }
        return true;
    }

    private boolean checkPossible(int[] row) {
        int[] freq = new int[row.length+1];
        for(int el : row) {
            freq[el]++;
            if(freq[el] > 1) {
                return false;
            }
        }
        return true;
    }
}