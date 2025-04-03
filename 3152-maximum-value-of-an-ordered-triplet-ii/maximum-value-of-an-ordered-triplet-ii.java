class Solution {
    public long maximumTripletValue(int[] nums) {
        // dmax, i max method
        long ans = 0, dmax = 0, imax = 0, n = nums.length;
        for(int k = 0; k < n; k++) {
            ans = Math.max(ans, dmax * nums[k]);
            dmax = Math.max(dmax, imax - nums[k]);
            imax = Math.max(imax, nums[k]);
        }
        return ans;
    }
}