class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) {
            if(num > 0) hs.add(num);
        }

        if(hs.isEmpty()) {
            return findMax(nums);
        }

        return findSum(hs);
    }

    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) max = num;
        }
        return max;
    }

    private int findSum(HashSet<Integer> hs) {
        int sum = 0;
        for(int s : hs) sum += s;
        return sum;
    }
}