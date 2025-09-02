class Solution {

    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> cur = new ArrayList<>();
        solve(0, s, cur);
        return ans;
    }

    public void solve(int ind, String s, List<String> cur) {
        // base case
        if(ind == s.length()) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        // calls
        for(int i = ind; i < s.length(); i++) {
            if(isPalindrome(s, ind, i)) {
                cur.add(s.substring(ind, i + 1));
                solve(i + 1, s, cur);
                // backtrack
                cur.remove(cur.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}