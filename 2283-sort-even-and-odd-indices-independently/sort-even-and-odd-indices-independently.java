class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evenIndices = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();

        // Separate even and odd indexed elements
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) evenIndices.add(nums[i]);
            else oddIndices.add(nums[i]);
        }

        // Sort even indices in non-decreasing order
        Collections.sort(evenIndices);

        // Sort odd indices in non-increasing order
        oddIndices.sort(Collections.reverseOrder());

        // Merge sorted values back into the original array
        int evenIdx = 0, oddIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) nums[i] = evenIndices.get(evenIdx++);
            else nums[i] = oddIndices.get(oddIdx++);
        }

        return nums;
    }
}