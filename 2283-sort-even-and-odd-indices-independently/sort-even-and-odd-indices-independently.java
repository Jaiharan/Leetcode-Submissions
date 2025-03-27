class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] evenFreq = new int[101];
        int[] oddFreq = new int[101];

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) evenFreq[nums[i]]++;
            else oddFreq[nums[i]]++;
        }
        int evenInd = 0, oddInd = 1;
        for(int i = 0; i <= 100; i++) {
            while(evenFreq[i]-- > 0) {
                nums[evenInd] = i;
                evenInd+=2;
            }
        }

        for(int i = 100; i >= 0; i--) {
            while(oddFreq[i]-- > 0) {
                nums[oddInd] = i;
                oddInd+=2;
            }
        }
        return nums;
    }
}