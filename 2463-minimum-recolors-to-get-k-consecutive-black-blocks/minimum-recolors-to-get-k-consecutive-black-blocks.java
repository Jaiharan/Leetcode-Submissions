class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start = 0, end = 0;
        int minCount = Integer.MAX_VALUE;
        int wCount = 0;
        while(end < blocks.length()) {
            if(blocks.charAt(end) == 'W') {
                wCount++;
            }
            if(end+1 - start == k) {
                minCount = Math.min(minCount, wCount);
                if(blocks.charAt(start) == 'W') {
                    wCount--;
                }
                start++;
            }
            end++;
        }
        return minCount;
    }
}