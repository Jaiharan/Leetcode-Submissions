class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                cnt++;
                if(cnt > ans) ans = cnt;
            } else if(c == ')') {
                cnt--;
            }
        }
        return ans;
    }
}