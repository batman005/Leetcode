class Solution {

    public boolean hasPath(ArrayList<ArrayList<Integer>> adj , int start , int end , boolean[] vis){

        if(start==end)  return true;
        vis[start] = true;

        for(int i : adj.get(start)){
            if(!vis[i]){
                if(hasPath(adj , i, end, vis))  return true;
            }
        }
        return false;

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] arr : edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        boolean ans = hasPath(adj , source , destination, vis);
        return ans;
    }
}