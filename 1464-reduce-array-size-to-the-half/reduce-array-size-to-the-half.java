class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int maxReduce = n / 2;
        return reduceArrSize(arr, maxReduce);
    }

    private int reduceArrSize(int[] arr, int maxReduce) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> freqList = new ArrayList<>(freqMap.values());
        Collections.sort(freqList, Collections.reverseOrder());
        int removed = 0, count = 0;
        for (int freq : freqList) {
            removed += freq;
            count++;
            if (removed >= maxReduce) break;
        }
        return count;
    }
}