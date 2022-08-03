import java.util.*;

public class Dijiktras {
    // eliminate longer paths between the starting node and all possible
    // destinations.

    public int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public void bfs(Queue<int[]> q, int[][] matrix, int r, int c) {
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            for (int[] d : dirs) {
                int x = cell[0] + d[0];
                int y = cell[1] + d[1];
                if (x < 0 || x >= r || y < 0 || y >= c ||
                        matrix[x][y] <= matrix[cell[0]][cell[1]] + 1)
                    continue;
                q.add(new int[] { x, y });
                matrix[x][y] = matrix[cell[0]][cell[1]] + 1;
            }
        }
    }

    public int[][] updateMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    q.offer(new int[] { i, j });
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        bfs(q, matrix, r, c);

        return matrix;
    }
}
