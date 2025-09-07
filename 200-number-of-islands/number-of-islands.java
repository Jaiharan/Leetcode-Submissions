class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, islands = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }
    // convert land into sea
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        // edge case
        if(i < 0 || i == m || j < 0 || j == n || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        // traverse
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}