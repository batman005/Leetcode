class Solution {
    public int minCost(String colors, int[] arr) {
        int n = colors.length();
        int[] storage = new int[n];
        storage[n - 1] = 0;
        for(int i = n - 2; i>= 0; i--){
            if(colors.charAt(i) == colors.charAt(i+1)){
                if(arr[i+1]>arr[i]){
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
                storage[i] = Math.min(arr[i],arr[i + 1]) + storage[i + 1];
            }
            else {
                storage[i] = storage[i + 1];
            }
        }
        return storage[0];
    }
}