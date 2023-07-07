class Solution {
public:
    int maxConsecutiveAnswers(string s, int k) {
             int size = s.size(), left = 0, ans = 0, cnt = 0;
        
        for(int i = 0; i < size; i++){
            if(s[i] == 'F')
                cnt++;
            while(cnt > k){
                if(s[left] == 'F')
                    cnt--;
                left++;
            }
            ans = max(i - left + 1, ans);
        }
        
        cnt = 0, left = 0;
        for(int i = 0; i < size; i++){
            if(s[i] == 'T')
                cnt++;
            while(cnt > k){
                if(s[left]  == 'T')
                    cnt--;
                left++;
            }
            ans = max(i - left + 1, ans);
        }
        return ans;
    }
};