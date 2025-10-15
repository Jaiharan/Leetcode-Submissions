class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int add = 1, prevAdd = 0, maxLen = 0;
        for(int i = 1; i < n; i++) {
            if(nums.get(i) > nums.get(i - 1)) {
                add++;
            } else {
                prevAdd = add;
                add = 1;
            }
            maxLen = Math.max(maxLen, Math.max(add/2, Math.min(prevAdd, add)));
        }
        return maxLen;
    }
}