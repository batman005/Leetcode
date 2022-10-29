class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        //Created a list to store all the plants
        List<Seed> plant = new ArrayList<>();
        for(int i= 0; i < plantTime.length;i++){
            plant.add(new Seed(plantTime[i],growTime[i]));
        }
       
        //Going for the one with max GrowthTime
        Collections.sort(plant, (a,b) -> (b.growTime - a.growTime));
        
        int time = 0;
        int max = 0;
        //plant max grow time first and keep track of max time it can take
        for(int i = 0; i < plantTime.length; i++){
            time += plant.get(i).plantTime;
            max = Math.max(max, time+plant.get(i).growTime);
        }
        return max;
    }
    
    //Created a private class for seed
    private class Seed{
        int plantTime;
        int growTime;
        
        public Seed(int p, int g){
            this.plantTime = p;
            this.growTime = g;
        }
    }
}