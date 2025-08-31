class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> sets = new ArrayList<>();
        solve(nums, 0, sets, subsets);
        return subsets;
    }

    public void solve(int[] nums, int ind, List<Integer> sets, List<List<Integer>> subsets) {
        // base case
        if(ind == nums.length) {
            subsets.add(new ArrayList<>(sets));
            return;
        }

        solve(nums, ind + 1, sets, subsets);
        sets.add(nums[ind]);
        solve(nums, ind + 1, sets, subsets);
        sets.remove(sets.size() - 1);
    }
}