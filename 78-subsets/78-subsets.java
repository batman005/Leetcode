class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        for(int num: nums){
            int subsetTillNow = res.size();
            for(int j = 0; j < subsetTillNow;j++){
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(num);
                res.add(temp);
            }
        }
        return res;
    }
}