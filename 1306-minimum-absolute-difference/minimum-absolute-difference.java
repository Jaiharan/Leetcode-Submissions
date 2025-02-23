class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = 99999;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] < minDiff) {
                minDiff = arr[i+1]-arr[i];
            }
        }

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}