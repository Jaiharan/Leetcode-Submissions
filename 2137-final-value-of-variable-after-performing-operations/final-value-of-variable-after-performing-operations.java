class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations) {
            if(str.contains("+")) x++;
            else x--;
        }
        return x;
    }
}