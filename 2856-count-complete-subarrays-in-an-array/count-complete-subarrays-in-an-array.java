class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int totalDistinct = getDistinctCount(nums, 0, n - 1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(nums[j]);
                if (seen.size() == totalDistinct) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private int getDistinctCount(int[] arr, int start, int end) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }
}