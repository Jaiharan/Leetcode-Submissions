class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, cur, ans);
        return ans;
    }

    public void solve(int[] nums, int t, int ind, List<Integer> cur, List<List<Integer>> ans) {
        // base case
            if(t == 0){
                ans.add(new ArrayList<>(cur));
                return;
            } 

        for(int i = ind; i < nums.length; i++) {
            if(i > ind && nums[i] == nums[i - 1]) continue;

            if(nums[i] <= t) {
                cur.add(nums[i]);
                solve(nums, t - nums[i], i + 1, cur, ans);
                cur.remove(cur.size() - 1);
            }
        }
    }
}