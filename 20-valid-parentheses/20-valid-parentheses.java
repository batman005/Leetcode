class Solution {
         public static boolean isValid(String s) {
    // Inilization of Stack
        Stack<Character> st = new Stack<>();
    // Iterating through the given String
        for (int i = 0; i < s.length(); i++) {
    // Push Open Brackets in the Stack
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
    // checking for the empty stack because if empty this means there is no open bracket at the start which is an invaild string.
            else if(st.empty()){
                return false;
            }
    // Check for the close brackets pair on the top and pop them
            else if (st.peek() == '{' && s.charAt(i) == '}' ) {
                st.pop();
            } else if (st.peek() == '(' && s.charAt(i) == ')' ) {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(i) == ']' ) {
                st.pop();
            }else{
                return false;
            }

        }
        return st.empty();


    }
}