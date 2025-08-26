class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // without sqrt
        double max = 0;
        int a = 0, b = 0;
        for(int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double dgL = (l * l) + (w * w);
            if(dgL > max) {
                a = l;
                b = w;
                max = dgL;
            } else if(dgL == max) {
                if((l * w) > (a * b)) {
                    a = l;
                    b = w;
                }
            }
        }
        return a * b;
    }
}