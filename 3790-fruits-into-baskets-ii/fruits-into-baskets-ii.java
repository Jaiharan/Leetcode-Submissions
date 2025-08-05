class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int total = fruits.length, cnt = 0;
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < total; i++) {
            for(int j = 0; j < total; j++) {
                if(baskets[j] >= fruits[i] && !hs.contains(j)) {
                    hs.add(j);
                    cnt++;
                    break;
                }
            }
        }
        return total - cnt;
    }
}