class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        // check for both horizontal and vertical cuts
        return checkCuts(rectangles, 0) || checkCuts(rectangles, 1);
    }

    private boolean checkCuts(int[][] rectangles, int dim) {
        int gapCount = 0;
        // sort based on start point
        Arrays.sort(rectangles, (a,b) -> Integer.compare(a[dim], b[dim]));
        // track first furthest point 
        int furthestEnd = rectangles[0][dim + 2];

        for(int i = 1; i < rectangles.length; i++) {
            int[] rect = rectangles[i];

            // if rectangle starts  after furthest we found gap
            if(furthestEnd <= rect[dim]) gapCount++;
            // set next furthestend for further gap
            furthestEnd = Math.max(furthestEnd, rect[dim + 2]);
        }
        // return count
        return gapCount >= 2;
    }
}