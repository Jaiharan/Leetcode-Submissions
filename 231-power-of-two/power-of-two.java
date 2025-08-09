class Solution {
    public boolean isPowerOfTwo(int n) {
        // for all 2 powers follow pattern like 10 -> 2, 100 -> 4 
        // so for n - 1 1 -> 1, 3 -> 11 so if we and 10 & 1 we get 00 for all possible 2 powers
        return n > 0 && (n & (n - 1)) == 0;
    }
}