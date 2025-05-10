class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sumOfArr1 = 0, sumOfArr2 = 0;
        long zerosInArr1 = 0, zerosInArr2 = 0;
        for(int num : nums1) {
            sumOfArr1 += num;
            if(num == 0) {
                zerosInArr1++;
                sumOfArr1++;
            }
        }
        for(int num : nums2) {
            sumOfArr2 += num;
            if(num == 0) {
                zerosInArr2++;
                sumOfArr2++;
            }
        }
        // edge case
        if((zerosInArr1 == 0 && sumOfArr2 > sumOfArr1) || (zerosInArr2 == 0 && sumOfArr1 > sumOfArr2)) {
            return -1;
        }
        // return max Sum
        return Math.max(sumOfArr1, sumOfArr2);
    }
}