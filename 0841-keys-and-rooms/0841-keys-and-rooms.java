class Solution {

    // TC : O(n2)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        
        while(!stack.isEmpty()){
            
            int node = stack.pop();
            for(int neigh: rooms.get(node))
                if(!seen[neigh]){
                    seen[neigh] = true;
                    stack.push(neigh);
                }
        }
        for(boolean v: seen)
            if(!v) return false;
        return true;

    }
}