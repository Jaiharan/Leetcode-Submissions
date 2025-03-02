class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> tm = new TreeMap<>();

        for(int[] nums : nums1) {
            tm.put(nums[0], nums[1]);
        }

        for(int[] nums : nums2) {
            tm.put(nums[0], tm.getOrDefault(nums[0], 0) + nums[1]);
        }

        int size = tm.size();
        int[][] ans = new int[size][2];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            ans[index][0] = entry.getKey();
            ans[index][1] = entry.getValue();
            index++;
        }
        return ans;
    }
}