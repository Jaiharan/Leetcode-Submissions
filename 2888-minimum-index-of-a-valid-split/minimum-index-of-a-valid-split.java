class Solution {
    public int minimumIndex(List<Integer> nums) {
        // Boyer-Moore Majority Voting Algorithm
        int x = nums.get(0), count = 0, xCount = 0, n = nums.size();
        //majority element survives
        for(int num : nums) {
            if(num == x) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                x = num;
                count = 1;
            }
        }
        // count freq of x
        for(int num : nums) {
            if(num == x) xCount++;
        }
        // check valid split is possible
        count = 0;
        for(int i = 0; i < n; i++) {
            if(nums.get(i) == x) {
                count++;
            }
            int remainingCount = xCount - count;
            if(count * 2 > i + 1 && remainingCount * 2 > n - i - 1) {
                return i;
            }
        }
        return -1;
    }
}