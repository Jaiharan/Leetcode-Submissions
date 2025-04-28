class Solution {
    public long countSubarrays(int[] nums, long k) {
        int len = nums.length;
        long res = 0, totalSum = 0;
        for(int i = 0, j = 0; j < len; j++) {
            totalSum += nums[j];
            while(i <= j && totalSum * (j - i + 1) >= k) {
                totalSum -= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}