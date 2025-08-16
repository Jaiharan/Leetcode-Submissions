class Solution {
    public int maximum69Number (int num) {
        int[] tens = {1000, 100, 10, 1};
        for (int t : tens) {
            int r = (num / t) % 10;
            if (r == 6) {
                return num + 3 * t;
            }
        }
        return num;
    }
}