class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diffArr = new int[n+1];
        for(int[] q : queries) {
            int l = q[0], r = q[1];
            diffArr[l]--;
            diffArr[r+1]++;
        }
        int currDecrement = 0;
        for(int i = 0; i < n; i++) {
            currDecrement += diffArr[i];
            if(nums[i] + currDecrement > 0) {
                return false;
            }
        }
        return true;
    }
}