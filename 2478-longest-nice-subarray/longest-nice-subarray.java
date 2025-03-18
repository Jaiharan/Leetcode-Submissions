class Solution {
    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0, start = 0, maxLen = 0;
        for(int end = 0; end < nums.length; ++end) {
            while((usedBits & nums[end]) != 0) {
                usedBits ^= nums[start];
                start++;
            }
            usedBits |= nums[end];
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}