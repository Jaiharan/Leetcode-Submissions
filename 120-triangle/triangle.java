class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return solve(triangle, 0, 0, dp);
    }

    private int solve(List<List<Integer>> ls, int row, int col, int[][] dp) {
        // edge case
        if(row == ls.size() - 1) {
            return ls.get(row).get(col);
        }

        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }

        int left = solve(ls, row+1, col, dp);
        int right = solve(ls, row+1, col+1, dp);

        return dp[row][col] = Math.min(left, right) + ls.get(row).get(col);
    }

}