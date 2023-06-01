class Solution {
   public int shortestPathBinaryMatrix(int[][] grid) {

    //check if grid is empty
    if(grid==null || grid.length==0 || grid[0].length==0 ){
        return -1;
    }
    int rowLen = grid.length;
    int columnLen = grid[0].length;

    //check if start and end exist
    if(grid[0][0]==1 || grid[rowLen-1][columnLen-1]==1){
       return -1; 
    }

    //all possible adjacent directions from a cell
    //  ↖  ^  ↗
    //  <[r,c]>
    //  ↙  ↓  ↘
    int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    
    //to keep track of visited cells
    boolean[][] visited = new boolean[rowLen][columnLen];

    //Queue to keep track of different levels of cells
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0}); //adding start cell
    visited[0][0] = true;
    int pathLen = 0;//Keep track of path length

    //with all the checks done we are now sure there is a starting and an end
    //Now we check all adjacent cells until we reach the end
    while(!queue.isEmpty()){
        int size = queue.size();
        pathLen++;

        for(int i=0; i<size; i++){
            int[] currentCell = queue.poll();

            //check if we have reached the end 
            if(currentCell[0] ==rowLen-1 && currentCell[1] == columnLen-1){
                return pathLen;
            }

            //check all adjacent positions from the current cell(level)
            for(int[] dir:directions){
                int nextX = currentCell[0]+dir[0];
                int nextY = currentCell[1]+dir[1];

                //check if the adjacent is not valid/already visited/1
                //  then ignore the cell if it is
                if(nextX < 0 || nextX >= rowLen
                    || nextY<0 || nextY >= columnLen 
                    || visited[nextX][nextY] || grid[nextX][nextY] == 1){
                    continue;
                }

                //add the valid cell to the queue
                visited[nextX][nextY] = true;
                queue.offer(new int[]{nextX,nextY});
            }
        }
    }
    return -1;
}
}