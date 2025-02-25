class Solution {
    public int numOfSubarrays(int[] arr) {
        // using prefixsum
        final int MOD = 1_000_000_007;
        int count = 0, prefixSum = 0;
        int oddCount = 0, evenCount = 1;

        for(int num : arr) {
            prefixSum += num;
            // if curr prefixsum is even 
            // add the number of odd subarrays
            if(isEven(prefixSum)) {
                count += oddCount;
                evenCount++;
            } else {
                // if curr prefixsum is odd
                // add thenumber of even subarrays
                count += evenCount;
                oddCount++;
            }
            // handle large results
            count %= MOD;
        }
        return count;
        
    }

    private boolean isEven(int n) {
        return n%2 == 0;
    }
}