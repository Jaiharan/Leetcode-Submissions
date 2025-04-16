class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int same = 0, right = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        long ans = 0;
        for(int left = 0; left < n; ++left) {
            while(same < k && right + 1 < n) {
                ++right;
                same += hm.getOrDefault(nums[right], 0);
                hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);
            }
            if(same >= k) {
                ans += n - right;
            }
            hm.put(nums[left], hm.get(nums[left]) - 1);
            same -= hm.get(nums[left]);
        }
        return ans;
    }
}