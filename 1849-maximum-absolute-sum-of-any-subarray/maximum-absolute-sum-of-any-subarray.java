class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = maxSubarraySum(nums);
        int min = minSubarraySum(nums);
        return Math.max(max, Math.abs(min));
    }

    private int maxSubarraySum(int[] arr) {
        // Your code here
        int max = Integer.MIN_VALUE;
        int i = 0, sum = 0;
        while(i < arr.length) {
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
            i++;
        }
        return max;
    }

    private int minSubarraySum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0, sum = 0;
        while(i < arr.length) {
            sum += arr[i];
            min = Math.min(min, sum);
            if(sum > 0) sum = 0;
            i++;
        }
        return min;
    }
}