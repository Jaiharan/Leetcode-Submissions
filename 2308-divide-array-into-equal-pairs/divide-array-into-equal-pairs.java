class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int num : nums) freq[num]++;
        for(int f : freq) if(f % 2 == 1) return false;
        return true;
    }
}