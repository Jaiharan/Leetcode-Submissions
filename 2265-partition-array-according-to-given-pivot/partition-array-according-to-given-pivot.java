class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        int pCount = 0;
        for(int num : nums){
            if(num < pivot) {
                less.add(num);
            }
            if(num == pivot) pCount++;
        }
        for(int i = 0; i < pCount; i++) {
            less.add(pivot);
        }
        ArrayList<Integer> greater = new ArrayList<>();
        for(int num : nums) {
            if(num > pivot) {
                greater.add(num);
            }
        }
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int el : less) {
            ans[ind++] = el;
        }
        for(int el : greater) {
            ans[ind++] = el;
        }
        return ans;
    }
}