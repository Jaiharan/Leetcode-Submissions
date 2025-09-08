class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public int atMost(int[] nums, int goal) {
        int l = 0, sum = 0, cnt = 0;
        for(int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while(l <= r && sum > goal) {
                sum -= nums[l++];
            }
            cnt += r - l + 1;
        }
        return cnt;
    }
}