class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, limit = 0;
        for(int num : nums) {
           limit = (num == 0) ? limit + 1 : 0;
            cnt += limit;
        }
        return cnt;
    }
}