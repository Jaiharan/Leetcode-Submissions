class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, start = 0, end = queries.length;
        if(!canTransform(nums, queries, end)) return -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(canTransform(nums, queries, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean canTransform(int[] nums, int[][] queries, int k) {
        int n = nums.length, sum = 0;
        int[] diffArr = new int[n+1];
        for(int i = 0; i < k; i++) {
            int l = queries[i][0], r = queries[i][1], v = queries[i][2];
            diffArr[l] += v;
            diffArr[r+1] -= v;
        }

        for(int i = 0; i < n; i++) {
            sum += diffArr[i];
            if(sum < nums[i]) return false;
        }
        return true;
    }
}