class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int ind1 = 0, ind2 = 0;
        ArrayList<int[]> arr = new ArrayList<>();

        while(ind1 < nums1.length && ind2 < nums2.length) {
            int[] temp = new int[2];

            if(nums1[ind1][0] == nums2[ind2][0]) {
                temp[0] = nums1[ind1][0];
                temp[1] = nums1[ind1][1] + nums2[ind2][1];
                ind1++;
                ind2++;
            } else if(nums1[ind1][0] < nums2[ind2][0]) {
                temp[0] = nums1[ind1][0];
                temp[1] = nums1[ind1][1];
                ind1++;
            } else {
                temp[0] = nums2[ind2][0];
                temp[1] = nums2[ind2][1];
                ind2++;
            }
            arr.add(temp);
        }

        while(ind1 < nums1.length) {
            arr.add(nums1[ind1++]);
        }
        while(ind2 < nums2.length) {
            arr.add(nums2[ind2++]);
        }

        return arr.toArray(new int[arr.size()][]);
    }
}