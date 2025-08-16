class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> ls = new ArrayList<>();
        int n = num;
        while(n > 0) {
            ls.add(n % 10);
            n /= 10;
        }
        int[] temp = new int[ls.size()];
        for(int i = 0; i < ls.size(); i++) {
            temp[ls.size() - 1 - i] = ls.get(i);
        }
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] == 6) {
                temp[i] = 9;
                break;
            }
        }
        int result = 0;
        for(int i = 0; i < temp.length; i++) {
            result = result * 10 + temp[i];
        }
        
        return result;
    }
}