class Solution {
    public int possibleStringCount(String word) {
        char prev = '0';
        int ans = 1;
        for(char ch : word.toCharArray()) {
            if(prev == ch) ans++;
            prev = ch;
        }
        return ans;
    }
}