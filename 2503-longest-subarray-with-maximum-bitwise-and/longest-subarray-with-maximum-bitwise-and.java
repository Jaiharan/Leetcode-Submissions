class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, count = 0, maxCount = 0;
        // find max element
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        // Using Kadane's algo find maxlen of max ele
        for(int i = 0; i < nums.length; i++) {
            if(max == nums[i]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        // return the maxlen
        if(maxCount == 0) return 1;
        return maxCount;
    }
}