class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, l = 0, r = 0;
        int maxCount = 0;
        int[] freq = new int[26];
        while(r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(r) - 'A']);
            while((r - l + 1) - maxCount > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}