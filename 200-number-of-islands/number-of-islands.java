class Solution {
    public int numIslands(char[][] grid) {

        int c = 0;
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[m][n];

        int[][] directions = {
                { -1, 0 },
                { 1, 0 },
                { 0, -1 },
                { 0, 1 }
        };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    c++;
                    q.offer(new int[] { i, j });
                    visited[i][j] = true;
                    while (q.size() > 0) {
                        int l = q.size();
                        int[] curr = q.poll();
                        int row = curr[0];
                        int col = curr[1];

                        for (int[] d : directions) {
                            int nr = d[0] + row;
                            int nc = d[1] + col;

                            if (nr >= 0 && nr <m && nc >= 0 && nc <n && grid[nr][nc] == '1' && !visited[nr][nc]) {
                                q.offer(new int[] { nr, nc });
                                visited[nr][nc] = true;
                            }
                        }
                    }
                }
            }
        }
        return c;
    }
}