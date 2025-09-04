class Solution {
    public int findClosest(int x, int y, int z) {
        int xS = Math.abs(z - x);
        int yS = Math.abs(z - y);
        if(xS == yS) return 0;
        return xS > yS ? 2 : 1;
    }
}