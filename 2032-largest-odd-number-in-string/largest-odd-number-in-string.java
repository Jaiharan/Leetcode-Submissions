class Solution {
    public String largestOddNumber(String num) {
        int maxIndex = -1;
        for(int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if(digit % 2 == 1) {
                maxIndex = i;
                break;
            }
        }
        return maxIndex == -1 ? "" : num.substring(0, maxIndex + 1);
    }
}