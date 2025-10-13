class Solution {

    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i = 1; i < n; i++) {
            if(!check(words[i], words[i - 1])) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    public boolean check(String word, String prev) {
        int n = word.length();
        int[] freq = new int[26];
        for(char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(char ch : prev.toCharArray()) {
            freq[ch - 'a']--;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) return false;
        }
        return true;
    }
}