class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        solve(candidates, n, k, 0, pos, ans);
        return ans;
    }

    public void solve(int[] arr, int t, int k, int ind, List<Integer> pos, List<List<Integer>> ans) {
        // base case
        if(ind == arr.length) {
            if(t == 0 && pos.size() == k) {
                ans.add(new ArrayList<>(pos));
            } 
            return;
        }

        // recurse
        if(arr[ind] <= t) {
            pos.add(arr[ind]);
            solve(arr, t - arr[ind], k, ind + 1, pos, ans);
            // backtrack
            pos.remove(pos.size() - 1);
        }
        // if curr ele is greater than we want, skip to next ind
        solve(arr, t, k, ind + 1, pos, ans);
    }
}
