class Solution {
    public long countSubarrays(int[] arr, long k) {
        // Sliding Window
        int len = arr.length;
        long res = 0, totalSum = 0;
        for(int i = 0, j = 0; j < len; j++) {
            totalSum += arr[j];
            while(i <= j && totalSum * (j - i + 1) >= k) {
                totalSum -= arr[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}