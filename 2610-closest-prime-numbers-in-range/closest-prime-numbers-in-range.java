class Solution {
    public int[] closestPrimes(int left, int right) {
        // get the list of prime numbers in range
        List<Integer> li = findPrimeBySieve(left, right);
        if(li.size() < 2) return new int[]{-1, -1};
        int[] arr = {-1, -1};
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < li.size()-1; i++) {
            int a = li.get(i);
            int b = li.get(i+1);
            int currdiff = b-a;
            if(diff > currdiff){
                diff = currdiff;
                arr[0] = a;
                arr[1] = b;
            }
        }
        return arr;
    }

    private List<Integer> findPrimeBySieve(int start, int limit) {
        boolean[] isPrime = new boolean[limit+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= limit; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= limit; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for(int i = start; i <= limit; i++) {
            if(isPrime[i]) primes.add(i);
        }
        return primes;
    }
}