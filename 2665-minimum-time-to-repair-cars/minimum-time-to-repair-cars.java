class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long maxMin = findMaxMin(ranks, cars);
        long start = 1, end = maxMin;
        while(start < end) {
            long mid = start + (end - start) / 2;
            if(canRepairUnderMin(ranks, cars, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    private boolean canRepairUnderMin(int[] ranks, int cars, long possiMin) {
        long carsDone = 0;
        for(int r : ranks) {
            long c = (long) Math.sqrt(possiMin / r);
            carsDone += c;
            if (carsDone >= cars) return true;
        }
        return carsDone >= cars;
    }

    private long findMaxMin(int[] ranks, int cars) {
        int maxRank = Arrays.stream(ranks).max().getAsInt();
        return (long) maxRank * (long)cars * cars;
    }
}