class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int n = costs.length;
        int icecream = 0;
        int sum = 0;
         
        for(int i = 0; i <  n; i++){
            sum += costs[i];
            icecream++;
            if(sum == coins) return icecream;
            if(sum > coins) return icecream-1;
        }
        return icecream;
    }
}