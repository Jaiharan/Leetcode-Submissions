class Solution {
    public int minOperations(int[][] grid, int x) {
        // create arra to flaten the grid
        ArrayList<Integer> nums = new ArrayList<>();
        int ans = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                nums.add(grid[i][j]);
            }
        }
        // Sort the nums to find median
        Collections.sort(nums);

        int n = nums.size();
        // store the median element as finalcommonValue
        int finalCommonValue = nums.get(n/2);

        // iterate through each num
        for(int num : nums) {
            // if reminder different we cant make it
            if(num % x != finalCommonValue % x) {
                return -1;
            }
            // else add the operations we could make with num
            ans += Math.abs(finalCommonValue - num) / x;
        }
        return ans;
    }
}