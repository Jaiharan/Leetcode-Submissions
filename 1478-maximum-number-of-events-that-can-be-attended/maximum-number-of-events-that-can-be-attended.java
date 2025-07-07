class Solution {
    public int maxEvents(int[][] events) {
        // sort based on starttime
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt = 0, day = 1, i = 0;

        while(i < events.length || !pq.isEmpty()) {
            // add events until curr day
            while(i < events.length && events[i][0] <= day) {
                pq.offer(events[i][1]);
                i++;
            }
            // remove events that wont be attended
            while(!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            // still events exists attend and add cnt
            if(!pq.isEmpty()) {
                pq.poll();
                cnt++;
            }
            // go to next day
            day++;
        }
        return cnt;
    }
}