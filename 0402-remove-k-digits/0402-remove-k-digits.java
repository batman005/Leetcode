class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        
        for(char c: num.toCharArray()){
            while(!s.isEmpty() && s.peek() > c && k > 0){
                s.pop();
                k--;
            }
            
            if(!s.isEmpty() || c != '0') s.push(c);
        }
        
        while(!s.isEmpty() && k-- !=0){
            s.pop();
        }
         if(s.isEmpty()) return "0";

        String res="";
        while(!s.isEmpty()){
            res= s.pop() + res;
        }

        return res;
    }
}