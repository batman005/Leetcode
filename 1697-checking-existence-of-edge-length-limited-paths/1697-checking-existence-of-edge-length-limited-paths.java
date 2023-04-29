class Solution {
    private int[] parent;
    private int[] rank;
    private int[] weight;
    
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
         
        parent = new int[n];
        rank  = new int[n];
        weight = new int[n];
        for(int i = 0; i < n; i++) parent[i] = i;
            Arrays.sort(edgeList, Comparator.comparingInt(a -> a[2]));
    
        for(int[] edge: edgeList) unionByRank(edge[0], edge[1], edge[2]);
        
        boolean[] answer = new boolean[queries.length];
        
        for(int i = 0; i < queries.length; i++)
                       answer[i] = isConnectedAndWithinLimit(queries[i][0], queries[i][1], queries[i][2]);

        return answer;
    }
    
    public boolean isConnectedAndWithinLimit(int p, int q, int limit){
        return find(p, limit) == find(q, limit);
    }
    
    
    private int find(int x, int limit){
        while(x != parent[x]){
            if(weight[x] >= limit){
                break;
            }
            
            x = parent[x];
        }
        return x;
    }
    // Union two nodes into the same connected component with the given limit as the weight of the edge
    private void unionByRank (int x, int y, int limit) {
        // Find the root of the connected component for each node
        int x_ref = find (x, Integer.MAX_VALUE);
        int y_ref = find (y, Integer.MAX_VALUE);
        if (x_ref != y_ref) {
            // If the rank of the root of x is less than the rank of the root of y, make y the parent of x
            if (rank[x_ref] < rank[y_ref]) {
                parent[x_ref] = y_ref;
                weight [x_ref] = limit;;
            } else {
                // Otherwise, make x the parent of y
                parent[y_ref] = x_ref;
                weight[y_ref] = limit;
                // If the ranks of the roots are equal, increment the rank of the root of x
                if (rank[x_ref] == rank[y_ref]) {
                    rank[x_ref]++;
                }
            }
        }
    }
}
