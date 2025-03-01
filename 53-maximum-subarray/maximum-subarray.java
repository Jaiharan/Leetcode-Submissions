class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algo
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max= (sum>max)?sum:max;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}