public class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int size = s.length();
        int left = 0;
        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'F')
                cnt++;
            while (cnt > k) {
                if (s.charAt(left) == 'F')
                    cnt--;
                left++;
            }
            ans = Math.max(i - left + 1, ans);
        }

        cnt = 0;
        left = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'T')
                cnt++;
            while (cnt > k) {
                if (s.charAt(left) == 'T')
                    cnt--;
                left++;
            }
            ans = Math.max(i - left + 1, ans);
        }
        return ans;
    }
}
