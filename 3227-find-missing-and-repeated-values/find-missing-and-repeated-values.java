class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] freq = new int[grid.length * grid[0].length + 1];
        for(int[] row : grid) {
            for(int el : row) {
                freq[el]++;
            }
        }
        int[] ans = new int[2];
        for(int i = 1; i < freq.length; i++) {
            if(freq[i] != 1 && freq[i] == 2) {
                ans[0] = i;
            } else if(freq[i] != 1 && freq[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}