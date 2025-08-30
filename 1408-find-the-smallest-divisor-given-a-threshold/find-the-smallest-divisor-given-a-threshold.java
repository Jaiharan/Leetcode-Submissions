class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = findmax(nums);
        int start = 1;
        while(start <= max) {
            int mid = start + (max - start) / 2;
           if(check(nums, mid) <= threshold) {
                max = mid - 1;
           } else {
                start = mid + 1;
           }
        }
        return start;
    }

    public int check(int[] nums, int divisor) {
        int ans = 0;
        for(int n : nums) {
            ans += Math.ceil((double)n / (double) divisor);
        }
        return ans;
    }


    public int findmax(int[] nums) {
        int ans = 0;
        for(int n : nums) {
            if(n > ans) ans = n;
        }
        return ans;
    }
}