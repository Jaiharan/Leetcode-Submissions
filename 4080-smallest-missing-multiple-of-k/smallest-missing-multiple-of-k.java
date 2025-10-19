class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiplier = 1;
        while(!isNot(k*multiplier, nums)) {
            multiplier++;
        }
        return k*multiplier;
    }

    public boolean isNot(int n, int[] nums) {
        for(int num : nums) {
            if(num == n) return false;
        }
        return true;
    }
}