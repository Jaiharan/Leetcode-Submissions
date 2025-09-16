class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] letters = text.split(" ");
        HashSet<Character> hs = new HashSet<>();
        for(char c : brokenLetters.toCharArray()) hs.add(c);
        int cnt = 0;
        for(String str : letters) {
            int i = 0;
            boolean has = false;
            while(i < str.length()) {
                if(hs.contains(str.charAt(i))) {
                    has = true;
                    break;
                }
                i++;
            }
            if(!has) cnt++; 
        }
        return cnt;
    }
}