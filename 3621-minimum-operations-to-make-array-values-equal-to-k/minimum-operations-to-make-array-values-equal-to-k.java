class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        int[] freq = new int[101];
        for(int num : nums) {
            if(num < k) return -1;
            freq[num]++;
        }
        for(int i = k+1; i < freq.length; i++) {
            if(freq[i] > 0) cnt++;
        }
        return cnt;
    }
}