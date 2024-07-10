class Solution {
    public int minOperations(String[] logs) {
        Stack<String> folderStack = new Stack<>();
        
        for(String currentOperation: logs){
            if(currentOperation.equals("../")){
                if(!folderStack.empty()){
                    folderStack.pop();
                }
            } else if(!currentOperation.equals("./")){
                folderStack.push(currentOperation);
            }
        }
        return folderStack.size();
    }
}