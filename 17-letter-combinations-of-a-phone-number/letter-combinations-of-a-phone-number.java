class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0) return ans;
        HashMap<Character, String> digitsToChars = new HashMap<>();
        digitsToChars.put('2', "abc");
        digitsToChars.put('3', "def");
        digitsToChars.put('4', "ghi");
        digitsToChars.put('5', "jkl");
        digitsToChars.put('6', "mno");
        digitsToChars.put('7', "pqrs");
        digitsToChars.put('8', "tuv");
        digitsToChars.put('9', "wxyz");
        solve(digits, 0, new StringBuilder(), ans, digitsToChars);
        return ans;
    }

    public void solve(String digits, int ind, StringBuilder str, List<String> ans, HashMap<Character, String> digitsToChars) {
        // base case
        if(ind == digits.length()) {
            ans.add(str.toString());
            return;
        }

        String chars = digitsToChars.get(digits.charAt(ind));
        for(char letters : chars.toCharArray()) {
            str.append(letters);
            solve(digits, ind + 1, str, ans, digitsToChars);
            str.deleteCharAt(str.length() - 1);
        }
    }
}