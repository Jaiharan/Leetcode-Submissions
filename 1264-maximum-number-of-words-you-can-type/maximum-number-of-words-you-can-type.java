class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        boolean[] broken = new boolean[26];
        for(char c : brokenLetters.toCharArray()) broken[c - 'a'] = true;
        for(String str : text.split(" ")) ans += canBuild(str, broken);
        return ans;
    }

    public int canBuild(String str, boolean[] broken) {
        for(char c : str.toCharArray()) if(broken[c - 'a']) return 0;
        return 1;
    }
}