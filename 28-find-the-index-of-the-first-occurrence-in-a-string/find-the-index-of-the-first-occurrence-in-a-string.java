class Solution {
    public int strStr(String haystack, String needle) {
        // using contains method
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}