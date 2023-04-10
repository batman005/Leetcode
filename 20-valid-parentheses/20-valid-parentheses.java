class Solution {
    public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c :
                    s.toCharArray()) {
                switch (c) {
                    case ')':
                        if (!stack.empty() && stack.peek().compareTo('(') == 0)
                            stack.pop();
                        else
                            stack.push(c);
                        break;
                    case ']':
                        if (!stack.empty() && stack.peek().compareTo('[') == 0)
                            stack.pop();
                        else
                            stack.push(c);
                        break;
                    case '}':
                        if (!stack.empty() && stack.peek().compareTo('{') == 0)
                            stack.pop();
                        else
                            stack.push(c);
                        break;
                    default:
                        stack.push(c);
                }
            }
            return stack.empty();
        }
}