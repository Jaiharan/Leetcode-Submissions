class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int mod = 1000000007;
        int[] poss = new int[n];
        int ans = 0;
        Arrays.sort(nums);
        poss[0] = 1;
        for(int i = 1; i < n; i++) {
            poss[i] = (poss[i - 1] * 2) % mod;
        }
        int left = 0, right = n-1;
        while(left <= right) {
            if(nums[left] + nums[right] <= target) {
                ans = (ans + poss[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}