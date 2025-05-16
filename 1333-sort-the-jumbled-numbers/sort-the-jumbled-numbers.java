class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> pairs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int mappedValue = 0;
            int place = 1;
            int temp = nums[i];
            if(temp == 0) {
                pairs.add(new int[] { mapping[0], i});
                continue;
            }
            while(temp != 0) {
                mappedValue = place * mapping[temp % 10] + mappedValue;
                place *= 10;
                temp /= 10;
            }
            pairs.add(new int[] {mappedValue, i});
        }
        Collections.sort(pairs, (a,b) -> a[0] - b[0]);
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[pairs.get(i)[1]];
        }
        return ans;
    }
}