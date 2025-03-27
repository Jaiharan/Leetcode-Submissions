class Solution {
    public int majorityElement(int[] nums) {
        // Boyer - moore voting algorithm
        int count = 0, xCount = 0, n = nums.length, x = nums[0];
        // majority element survives
        for(int num : nums){
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
        // Get freq of x
        for(int num : nums) {
            if(num == x) {
                xCount++;
            }
        }
        return xCount > n/2 ? x : -1;
    }
}