class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // for circular array compute once before monostack
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];
            while(!st.isEmpty() && st.peek() <= curr) st.pop();
            // compute only on second time
            if(i < n) ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(curr);
        }
        return ans;
    }
}