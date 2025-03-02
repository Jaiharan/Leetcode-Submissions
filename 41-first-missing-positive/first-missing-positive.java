class Solution {
    public int firstMissingPositive(int[] nums) {
        // Cyclic Sort
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums.length >= nums[i] && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // return first missing num
        for(int ind = 0; ind < nums.length; ind++) {
            if(nums[ind] != ind+1) {
                return ind+1;
            }
        }
        return nums.length+1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}