class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int n = image[0].length;

        // for(int[] row : image) {
        //     for(int i = 0; i < (n+1)/2; i++) {
        //         int temp = row[i] ^ 1;
        //         row[i] = row[n - 1 - i] ^ 1;
        //         row[n - 1 - i] = temp;
        //     }
        // }
        // return image;

        for(int i = 0; i < image.length; i++) {
            image[i] = swapArr(image[i]);
        }

        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;
            }
        }
        return image;
    }

    private static int[] swapArr(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}