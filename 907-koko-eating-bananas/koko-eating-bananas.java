class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = findMax(piles);
        int start = 0;
        int ans = 0;
        while(start <= max) {
            int mid = start + (max - start) / 2;
            if(isValid(piles, mid, h)) {
                ans = mid;
                max = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public boolean isValid(int[] piles, int mid, int h) {
        double cnt = 0;
        for(int n : piles) {
            cnt += Math.ceil((double)n / (double)mid);
        }
        return cnt <= h;
    }

    public int findMax(int[] piles) {
        int max = 0;
        for(int n : piles) {
            if(n > max) max = n;
        }
        return max;
    }
}