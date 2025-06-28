class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            fast = findHappy(findHappy(fast));
            slow = findHappy(slow);
        } while(slow != fast);
        if(slow == 1) return true;
        return false;
    }

    private int findHappy(int n) {
        int sum = 0;
        while(n > 0) {
            sum += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sum;
    }
}