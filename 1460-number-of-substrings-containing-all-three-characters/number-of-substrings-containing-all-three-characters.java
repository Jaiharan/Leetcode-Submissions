class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0, cnt = 0;
        int[] charFreq = new int[3];
        while(right < s.length()) {
            charFreq[s.charAt(right) - 'a']++;
            while(charFreq[0] != 0 && charFreq[1] != 0 && charFreq[2] != 0) {
                cnt += s.length() - right;
                charFreq[s.charAt(left++) - 'a']--;
            }
            right++;
        }
        return cnt;
    }
}