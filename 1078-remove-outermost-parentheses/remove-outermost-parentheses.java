class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()) {
            if(c == '(' && open++ > 0) {
                str.append(c);
            } else if(c == ')' && open-- > 1) {
                str.append(c);
            }
        }
        return str.toString();
    }
}