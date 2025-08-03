class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permute(nums, temp, ans, freq);
        return ans;
    }

    private void permute(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] freq) {
        // base case 
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                temp.add(nums[i]);
                permute(nums, temp, ans, freq);
                // backtrack
                temp.remove(temp.size() - 1);
                freq[i] = false;
            }
        }
    }
}