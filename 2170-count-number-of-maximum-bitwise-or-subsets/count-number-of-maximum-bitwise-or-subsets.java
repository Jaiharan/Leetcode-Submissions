class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOrValue = 0;
        for(int num : nums) {
            maxOrValue |= num;
        }
        Integer[][] memo = new Integer[n][maxOrValue + 1];
        return countSubsets(nums, 0, 0, maxOrValue, memo);
    }

    private int countSubsets(int[] nums, int index, int currentOr, int targetOr, Integer[][] memo) {
        // base cases
        if(index == nums.length) {
            return (currentOr == targetOr)? 1 : 0;
        }
        if(memo[index][currentOr] != null) {
            return memo[index][currentOr];
        }

        int countWithout = countSubsets(nums, index + 1, currentOr, targetOr, memo);

        int countWith = countSubsets(nums, index + 1, currentOr | nums[index], targetOr, memo);

        return memo[index][currentOr] = countWithout + countWith;
    }
}