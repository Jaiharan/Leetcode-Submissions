class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ls = new ArrayList<>();
        int curr = 0;
        int sum = 0;
        for(String str : operations) {
            if(str.matches("-?\\d+")) {
                ls.add(Integer.parseInt(str));
                curr++;
            } else if(str.equals("+")) {
                int num = ls.get(curr-1) + ls.get(curr-2);
                ls.add(num);
                curr++;
            } else if(str.equals("D")) {
                int num = ls.get(curr-1);
                ls.add(num * 2);
                curr++;
            } else {
                ls.remove(curr-1);
                curr--;
            }
        }
        if(ls.isEmpty()) return 0;
        for(int num : ls) sum += num;
        return sum;
    }
}