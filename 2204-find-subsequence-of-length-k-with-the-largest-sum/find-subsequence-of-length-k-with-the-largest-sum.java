class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // sort based on value
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] ans = new int[k];
        for(int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if(pq.size() > k) pq.poll();
        }
        int[][] sortBasedInd = pq.toArray(new int[0][0]);
        // sort based on indices
        Arrays.sort(sortBasedInd, Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < k; i++) {
            ans[i] = nums[sortBasedInd[i][1]];
        }
        return ans;
    }
}