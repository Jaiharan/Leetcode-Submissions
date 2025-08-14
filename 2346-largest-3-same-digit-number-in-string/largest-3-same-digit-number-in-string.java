class Solution {
    public String largestGoodInteger(String num) {
        char maxChar = '.';
        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if (num.charAt(i) > maxChar) {
                    maxChar = num.charAt(i);
                }
            }
        }
        if (maxChar == '.') return "";
        return "" + maxChar + maxChar + maxChar;
    }
}