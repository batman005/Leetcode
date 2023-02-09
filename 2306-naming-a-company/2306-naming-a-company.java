class Solution {
    public long distinctNames(String[] ideas) {
     HashSet<Integer>[] count = new HashSet[26];
        for(int i = 0; i < 26; ++i)
            count[i] = new HashSet<>();
        for(String idea : ideas){
             char initial = idea.charAt(0);
            count[initial- 'a'].add(idea.substring(1).hashCode());
        }

        long res = 0;
        for(int i = 0; i < 26; ++i){
            for(int j = i + 1; j < 26; j++){
                int commonSuffixes = 0;
                for(int ideaSuffix: count[i]){
                    if(count[j].contains(ideaSuffix)){
                        commonSuffixes++;
                    }
                }
                res+=(count[i].size() - commonSuffixes) * (count[j].size() - commonSuffixes);
            }
        }
        return res * 2;
    }
}