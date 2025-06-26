class Solution {
    public int longestSubsequence(String s, int k) {
        int low = 0, cnt = 0;
        int bits = (int) (Math.log(k) / Math.log(2)) + 1;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if(ch == '1'){
                if(i < bits && low + (1 << i) <= k) {
                    low += 1 << i;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}