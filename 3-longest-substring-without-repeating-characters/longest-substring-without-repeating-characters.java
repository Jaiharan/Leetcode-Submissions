class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window Approach
        int left = 0, right = 0;
        int maxLen = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right < s.length()) {
            if(!hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}