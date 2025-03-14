class Solution {
    public int maximumCandies(int[] candies, long k) {
        // range to identify possible distribution
        int start = 1, end = Integer.MAX_VALUE;
        int ans = 0;
        // search possible distribution using BS
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // count possible count of children get candies
            long possiChildCount = 0;
            // add posible child 
            for(int c : candies) {
                possiChildCount += c / mid;
            }
            // check whether the distribution feed possible children
            if(possiChildCount >= k) {
                // possible ans
                ans = mid;
                start = mid + 1;
            } else {
                // else start search in upper bound
                end = mid - 1;
            }
        }
        // return max possible distribution
        return ans;
    }
}