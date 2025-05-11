import java.util.*;
class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int left = 0;
        int right = freq.length - 1;
        while (left < right) {
            int temp = freq[left];
            freq[left] = freq[right];
            freq[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < k; i++) {
            freq[i] = 0;
        }
        for(int num : freq) {
            ans += num;
        }
        return ans;
    }
}