class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int l = 0, r = 0, curr = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(r < nums.length) {
            if(hs.contains(nums[r])) {
                while (hs.contains(nums[r])) {
                    curr -= nums[l];
                    hs.remove(nums[l]);
                    l++;
                }
            }
            curr += nums[r];
            if(curr > ans) ans = curr;
            hs.add(nums[r]);
            r++;
        }
        return ans;
    }
}