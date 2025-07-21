class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int freq = 0;
        char prev = '6';
        for(char ch : s.toCharArray()) {
            freq++;
            if(ch == prev) freq++;
            else freq = 0;
            if(freq >= 3) continue;
            ans.append(ch);
            prev = ch;
        }
        return ans.toString();
    }
}