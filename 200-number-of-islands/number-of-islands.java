class Solution {

    int m, n;

    int[][] directions = {
        {-1, 0},  // up
        {1, 0},   // down
        {0, -1},  // left
        {0, 1}    // right
    };

    public int numIslands(char[][] grid) {

        m = grid.length;
        n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int count = 0;

        // Scan the complete grid
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Found a new island
                if (grid[i][j] == '1' && !visited[i][j]) {

                    count++;

                    // Visit the complete island
                    bfs(i, j, grid, visited);
                }
            }
        }

        return count;
    }


    void bfs(int row, int col, char[][] grid, boolean[][] visited) {

        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{row, col});
        visited[row][col] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            // Check 4 directions
            for (int[] d : directions) {

                int nr = r + d[0];
                int nc = c + d[1];

                // Valid neighbour?
                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == '1' &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;

                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}