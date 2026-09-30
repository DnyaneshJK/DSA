class Solution {
    int fresh = 0;

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int c=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    c++;
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minutes =  bfs(q,grid);
        if(fresh>0) return -1;
        return minutes;
    }

    public int bfs(Queue<int[]> q,int[][] grid){
        int minutes=0;
        int[][] directions = {
            {-1,0},
            {1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                
        int[] curr = q.poll();
        int row = curr[0];
        int col = curr[1];

        for(int[] dir : directions){
            int a = row +dir[0];
            int b = col +dir[1];

            if(a>=0 && a<grid.length && b>=0 && b<grid[0].length && grid[a][b]==1){
                grid[a][b]=2;
                fresh--;
                q.offer(new int[]{a,b});
            }
        }
            }
            if(!q.isEmpty()){
                minutes++;
            }
        }
        return minutes;

    }
}