class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int i = 0; i < nums.length; i+=3) {
            if(!hasDistinct(nums, i)) op++;
        }
        return op;
    }

    private boolean hasDistinct(int[] nums, int start) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = start; i < nums.length; i++) {
            if(hs.contains(nums[i])) return false;
            hs.add(nums[i]);
        }
        return true;
    }
}