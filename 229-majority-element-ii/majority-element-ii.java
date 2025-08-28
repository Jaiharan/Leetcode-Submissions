class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (nums == null || n == 0) {
            return ans;
        }
        int count1=0,count2=0,posnum1=0,posnum2=0;
        for(int i=0; i<n;i++){
            if(count1 == 0 && nums[i] != posnum2){
                count1++;
                posnum1 = nums[i];
            } else if(count2 == 0 && nums[i] != posnum1){
                count2++;
                posnum2 = nums[i];
            } else if(nums[i] == posnum1){
                count1++;
            } else if(nums[i] == posnum2){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        // reset
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == posnum1){
                count1++;
            } else if(num == posnum2){
                count2++;
            }
        }

        if(count1 > (n/3)) ans.add(posnum1);
        if(count2 > (n/3)) ans.add(posnum2);
        return ans;
    }
}