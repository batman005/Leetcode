class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int N = stations.length, ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int i = 0; i <= N; i++){
            int distance = i == N ? target : stations[i][0];
            
            while(startFuel < distance){
                if(pq.size() == 0)
                    return - 1;
                startFuel += pq.poll();
                ans++;
            }
            if(i < N) pq.add(stations[i][1]);
        
        }
        return ans;
    }
}