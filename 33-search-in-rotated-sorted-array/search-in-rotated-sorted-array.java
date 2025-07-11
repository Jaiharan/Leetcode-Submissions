class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) {
            return bsInArr(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target) return pivot;
        if(target >= nums[0]) {
            return bsInArr(nums, target, 0, pivot - 1);
        }
        return bsInArr(nums, target, pivot + 1, nums.length-1);
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases will be here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int bsInArr(int[] arr, int target,  int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}