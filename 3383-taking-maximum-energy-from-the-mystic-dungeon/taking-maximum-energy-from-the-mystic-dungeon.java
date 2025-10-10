class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int ans = Integer.MIN_VALUE;
        int n = energy.length;
        for(int i = n-1; i >= 0; i--) {
            energy[i] = (i+k < n ? energy[i + k] : 0) + energy[i];
            ans = Math.max(ans, energy[i]);
        }
        return ans;
    }
}