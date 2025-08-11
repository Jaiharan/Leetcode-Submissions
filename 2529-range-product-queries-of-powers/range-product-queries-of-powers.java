class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod = 1000000007;
        List<Long> p2 = new ArrayList<>();
        int[] res = new int[queries.length];
        int i = 0;
        long power = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                p2.add(power);
            }
            power *= 2;
            n /= 2;
        }

        for (int[] q : queries) {
            long prod = 1;
            for (int j = q[0]; j <= q[1]; j++) {
                prod = (prod * p2.get(j)) % mod;
            }
            res[i] = (int) prod;
            i++;
        }
        return res;
    }
}