class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean vowel = false;
        boolean consonant = false;
        for(char ch : word.toCharArray()) {
            if(!Character.isLetterOrDigit(ch)) return false;
            if(isVowel(ch)) vowel = true;
            if(isConsonant(ch)) consonant = true;
        }
        return vowel && consonant;
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return Character.isLetter(ch) && !isVowel(ch);
    }
}