class Solution {
    public int totalFruit(int[] fruits) {
        // pick max length of trees of subarray we could pick 
        // Sliding window
        HashMap<Integer, Integer> hm = new HashMap<>();
        int start = 0, end = 0;
        int n = fruits.length, maxLen = 0;
        int MAX_THRESHOLD = 3;
        while(end < n) {
            hm.put(fruits[end], hm.getOrDefault(fruits[end], 0) + 1);
            while(hm.size() >= MAX_THRESHOLD) {
                hm.put(fruits[start], hm.get(fruits[start]) - 1);
                if(hm.get(fruits[start]) == 0) hm.remove(fruits[start]);
                start++;
            }
            int currLen = end - start + 1;
            maxLen = Math.max(maxLen, currLen);
            end++;
        }
        return maxLen;
    }
}