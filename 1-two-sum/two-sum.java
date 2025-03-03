class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int ind = 0;
        while(ind < n) {
            int diff = target - nums[ind];
            if(hm.containsKey(diff)) {
                return new int[] {hm.get(diff), ind};
            }
            hm.put(nums[ind], ind);
            ind++;
        }
        return new int[]{};
    }
}