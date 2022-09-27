class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length(), max = Integer.MAX_VALUE, idx = max;
        int[] left = new int[n]; //store the closest R distance from left
        char[] ch = dominoes.toCharArray();
        
        for(int i = 0; i < n; i++){
            if(ch[i] == 'L')
                left[i] = (idx = max);
            else if(ch[i] == 'R')
                left[(idx = i)] = max;
            else 
                left[i] = idx == max ? max : i - idx;
        }
        idx = max;
        for(int i = n - 1, temp; i>= 0; i--){
            if(ch[i] == 'R')
                temp = (idx = max);
            else if (ch[i] == 'L'){
                temp = max;
                idx = i;
            } else 
                temp = idx == max ? max: idx - i;
            
            if(left[i] != temp)
                ch[i] = left[i] < temp ? 'R' : 'L';
        }
        return new String(ch);
    }
}