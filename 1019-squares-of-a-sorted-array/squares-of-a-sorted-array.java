class Solution {
    public int[] sortedSquares(int[] nums) {
        // int n = nums.length;
        // for(int i = 0; i < n; i++) {
        //     nums[i] *= nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        int n = nums.length;
        int[] ans = new int[n];

        int i = 0, j = n-1;
        for(int p = n-1; p >= 0; p-- ) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[p] = nums[i] * nums[i];
                i++;
            } else {
                ans[p] = nums[j] * nums[j];
                j--;
            }
        }

        return ans;
    }
}