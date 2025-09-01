class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < num.length(); i++) {
            freq[(int)num.charAt(i)-'0']++;
        }
        int sing = -1;
        for(int i = 9; i >= 0; i--) {
            if(str.length() == 0 && i == 0) continue;
            while(freq[i] > 1) {
                str.append((char)(i+'0'));
                freq[i] -= 2;
            }
            if(freq[i] == 1 && sing == -1) sing = i;
        }

        if(str.length() == 0 && sing == -1) return "0";
        int i = str.length() - 1;
        if(sing != -1) str.append((char) (sing+'0'));
        for(; i >= 0; i--) {
            str.append(str.charAt(i));
        }
        return str.toString();
    }
}