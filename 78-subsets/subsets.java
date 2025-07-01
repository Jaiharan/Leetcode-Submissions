class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        recurs(nums, 0, op, ans);
        return ans;
    }

    private void recurs(int[] nums, int ind, List<Integer> op, List<List<Integer>> ans) {
        // base case
        if(ind == nums.length) {
            ans.add(new ArrayList<>(op));
            return;
        }

        recurs(nums, ind+1, op, ans);
        op.add(nums[ind]);
        recurs(nums, ind+1, op, ans);
        op.remove(op.size() - 1);
    }
}