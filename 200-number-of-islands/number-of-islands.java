class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        if (n == 0 || m == 0 || grid == null) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    c++;
                }
            }
        }
        return c;
    }

    public void dfs(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

    }
}

//BFS APPROCH
// class Solution {
//     public int numIslands(char[][] grid) {

//         int c = 0;
//         int m = grid.length;
//         int n = grid[0].length;

//         Queue<int[]> q = new ArrayDeque<>();
//         boolean[][] visited = new boolean[m][n];

//         int[][] directions = {
//                 { -1, 0 },
//                 { 1, 0 },
//                 { 0, -1 },
//                 { 0, 1 }
//         };

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (grid[i][j] == '1' && !visited[i][j]) {
//                     c++;
//                     q.offer(new int[] { i, j });
//                     visited[i][j] = true;
//                     while (q.size() > 0) {
//                         int l = q.size();
//                         int[] curr = q.poll();
//                         int row = curr[0];
//                         int col = curr[1];

//                         for (int[] d : directions) {
//                             int nr = d[0] + row;
//                             int nc = d[1] + col;

//                             if (nr >= 0 && nr <m && nc >= 0 && nc <n && grid[nr][nc] == '1' && !visited[nr][nc]) {
//                                 q.offer(new int[] { nr, nc });
//                                 visited[nr][nc] = true;
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//         return c;
//     }
// }