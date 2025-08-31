class Solution {
    public int beautySum(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                int beautyCnt = findBeauty(s.substring(i, j+1));
                if(beautyCnt > 0) cnt += beautyCnt;
            }
        }
        return cnt;
    }

    public int findBeauty(String s) {
        int[] freq = new int[26];
        for(char  ch : s.toCharArray()) freq[ch - 'a']++;
        int low = Integer.MAX_VALUE, high = 0;
        for(int f : freq) {
            if(f > high) high = f;
            if(f < low && f != 0) low = f;
        }
        return high - low;
    }
}