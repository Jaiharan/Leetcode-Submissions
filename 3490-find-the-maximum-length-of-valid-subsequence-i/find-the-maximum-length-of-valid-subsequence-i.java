class Solution {
    public int maximumLength(int[] nums) {
        int evenCnt = 0, oddCnt = 0;
        int evenDp = 0, oddDp = 0;
        for(int num : nums) {
            if(num % 2 == 0) evenCnt++;
            else oddCnt++;
        }
        for(int num : nums) {
            if(num % 2 == 0) {
                evenDp = Math.max(evenDp, oddDp + 1);
            } else {
                oddDp = Math.max(oddDp, evenDp + 1);
            }
        }
        return Math.max(Math.max(evenCnt, oddCnt), Math.max(evenDp, oddDp));
    }
}