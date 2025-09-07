class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        int sys = n / 2;
        int num = 1;
        while(sys > 0) {
            ls.add(num);
            ls.add(num * -1);
            num++;
            sys--;
        }
        if(n % 2 == 1) ls.add(0);
        int[] ans = new int[ls.size()];
        int i = 0;
        while(i < ls.size()) {
            ans[i] = ls.get(i);
            i++;
        }
        return ans;
    }
}