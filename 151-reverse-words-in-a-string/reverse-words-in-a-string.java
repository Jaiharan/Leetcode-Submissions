class Solution {
    public String reverseWords(String s) {
        // split the string into string array
        String[] str = s.trim().split("\\s+");
        // declare variable for out
        String ans = "";
        // traverse from last and add to out
        for(int i = str.length-1; i > 0; i--) {
            ans += str[i] + " ";
        }
        // add last string separate to avoid spaces
        return ans + str[0];
    }
}