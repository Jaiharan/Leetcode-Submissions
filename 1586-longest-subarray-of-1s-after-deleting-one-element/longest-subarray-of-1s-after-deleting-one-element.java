class Solution {
    public int longestSubarray(int[] nums) {
        // sliding window
        int chance = 0, max = 0, i = 0;
        for(int j = 0; j < nums.length; j++) {
            chance += (nums[j] == 0 ? 1 : 0);
            while(chance > 1) {
                chance -= (nums[i] == 0 ? 1 : 0);
                i++;
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}