class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int one = 1; one < n; one++) {
            int sec = n - one;
            if(!String.valueOf(one).contains("0") && !String.valueOf(sec).contains("0")){
                return new int[] { one, sec};
            }
        }
        return new int[0];
    }
}