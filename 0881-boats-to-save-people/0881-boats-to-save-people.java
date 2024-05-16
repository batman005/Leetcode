class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int minboats = 0;
        int i = 0;
        int j = people.length - 1;
        
        while(i <= j){
            minboats++;
            
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
        }  
        return minboats;
    }
}