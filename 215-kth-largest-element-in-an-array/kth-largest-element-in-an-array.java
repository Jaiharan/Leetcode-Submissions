class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums) {
            pq.add(n);
        }
        int count = nums.length - k;
        for(int i = 0; i < count; i++) {
            pq.remove();
        }
        return pq.peek();
    }
}