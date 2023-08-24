class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int water = 0;
        while(start < end){
            int w = end - start;
            int h = Math.min(height[start],height[end]);
             water = Math.max(water, h * w);
            if(height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }
        
        return water;
    }
}