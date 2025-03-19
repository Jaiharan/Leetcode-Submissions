class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, cnt = 0;

        for(int i = 0; i < n-2; i++) {
            if(nums[i] == 1) continue;
            for(int j = i; j <= i+2; j++) {
                nums[j] = nums[j] ^ 1;
            }
            cnt++;
        }

        if(nums[n-2] == 0 || nums[n-1] == 0) return -1;
        return cnt;
    }
}