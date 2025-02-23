class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n = grid.length, m = grid[0].length;
        long sum = 0;
        // use max heap to store elements in descending order
        PriorityQueue<int[]> result = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        // push elements into heap with their row indices
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result.add(new int[]{grid[i][j], i});
            }
        }
        // track ele from each row
        int[] caught = new int[n];
        // extract largest ele from heap
        while(k > 0 && !result.isEmpty()) {
            int[] limited = result.poll();
            int value = limited[0], row = limited[1];

            if(caught[row] < limits[row]) {
                sum += value;
                caught[row]++;
                k--;
            }
        }
        return sum;
    }
}