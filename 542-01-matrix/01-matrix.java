class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] ans = new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    ans[i][j]=0;
                    visited[i][j]=true;
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] d : directions){
                    int nr = r + d[0];
                    int nc = c + d[1];
                    int dist=0;

                    if(nr>=0 && nr<mat.length && nc>=0 && nc<mat[0].length && mat[nr][nc]==1 && visited[nr][nc]==false){
                        visited[nr][nc]=true;
                        ans[nr][nc] = ans[r][c]+1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return ans;
    }
}