class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = height.length-1;
        int maxL = 0, maxR = 0;
        int ans = 0;
        while(left <= right) {
            if(height[left] <= height[right]) {
                if(height[left] >= maxL) maxL = height[left];
                else ans += maxL - height[left];
                left++;
            } else {
                if(height[right] >= maxR) maxR = height[right];
                else ans += maxR - height[right];
                right--;
            }
        }
        return ans;
    }
}