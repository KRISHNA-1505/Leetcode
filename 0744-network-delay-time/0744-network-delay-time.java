class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new ArrayList[n];
        Arrays.setAll(graph, o -> new ArrayList<>());
        for (int[] time : times) {
            graph[time[0] - 1].add(new int[]{time[1] - 1, time[2]});
        }
        int[] dis = new int[n]; 
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[k - 1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{k - 1, 0}); 
        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int x = node[0];
            int dx = node[1];
            if (dx > dis[x]) {
                continue;      }
            dis[x] = dx;
            for (int[] kid : graph[x]) {
                int y = kid[0];
                int dy = dx + kid[1];
                if (dy < dis[y]) {
                    dis[y] = dy;
                    pq.add(new int[]{y, dy});
                }
            }
        }
        int max = 0;
        for (int d : dis) {
            if (d == Integer.MAX_VALUE) return -1;
            max = Math.max(max, d);
        }
        return max;
    }
}