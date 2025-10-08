class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        for(int i = 0; i < n; i++) {
            int ind = bs(spells[i], potions, success);
            if(ind != -1) {
                ans[i] = potions.length - ind;
            }
        }
        return ans;
    }

    public int bs(int spell, int[] potions, long success) {
        int start = 0, end = potions.length - 1;
        int ind = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if((long)potions[mid] * spell >= success) {
                ind = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ind;
    }
}