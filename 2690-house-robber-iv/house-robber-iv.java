class Solution {
    public int minCapability(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int num : nums) {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        while(min < max) {
            int mid = min + (max - min) / 2;
            if(checkMinKElements(nums, k, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private boolean checkMinKElements(int[] nums, int k, int mid) {
        int houseCnt = 0;
        int i = 0;
        while(i < nums.length) {
            if(nums[i] <= mid) {
                houseCnt++;
                i += 2;
            } else {
                i++;
            }
        }
        return houseCnt >= k;
    }
}