class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i : answers) mp.put(i, mp.getOrDefault(i, 0) + 1);
        int ans = 0;
        for(Map.Entry<Integer, Integer> set : mp.entrySet()) {
            ans += (set.getKey() + 1) * Math.ceil((double) set.getValue() / (set.getKey() + 1));
        }
        return ans;
    }
}