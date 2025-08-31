class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> sets = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, sets, subsets);
        return subsets;
    }

    public void solve(int[] nums, int ind, List<Integer> sets, List<List<Integer>> subsets) {
        // base case
        subsets.add(new ArrayList<>(sets));

        for(int i = ind; i < nums.length; i++) {
            if(i != ind && nums[i] == nums[i - 1]) continue;
            sets.add(nums[i]);
            solve(nums, i + 1, sets, subsets);
            sets.remove(sets.size() - 1);
        }
    }
}