class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0, 0, "", n, ans);
        return ans;
    }

    private void dfs(int openP, int closeP, String s, int n, List<String> ans) {
        // base case
        if(openP == closeP && openP + closeP == 2*n) {
            ans.add(s);
            return;
        }

        if (openP < n) {
            dfs(openP + 1, closeP, s + "(", n, ans);
        }

        if (closeP < openP) {
            dfs(openP, closeP + 1, s + ")", n, ans);
        }
    }
}