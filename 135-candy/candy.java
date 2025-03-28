class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1) return 1; 

        int[] left = new int[n];
        Arrays.fill(left, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        int sum = left[n - 1];
        int curr = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                curr++;
            } else {
                curr = 1;
            }
            sum += Math.max(left[i], curr);
        }

        return sum;
    }
}