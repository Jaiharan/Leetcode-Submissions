class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        ArrayList<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));
        s = "";
        for(char c : chars) {
            int count = freq.get(c);
            for(int i = 0; i < count; i++) {
                s = s + c;
            }
        }
        return s;
    }
}