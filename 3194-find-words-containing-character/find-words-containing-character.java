class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(""+x)) ls.add(i);
        }
        return ls;
    }
}