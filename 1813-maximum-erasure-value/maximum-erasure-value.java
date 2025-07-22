class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int n = nums.length;
        int[] freq = new int[10001];
        int l = 0, count = 0, max = 0;
        for (int r = 0; r < n; r++) {
            int num = nums[r];
            while (freq[num] > 0) {
                freq[nums[l]]--;
                count -= nums[l];
                l++;
            }
            freq[num]++;
            count += num;
            max = Math.max(max, count);
        }
        return max;
    }
}