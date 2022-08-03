package day4;

import java.util.Arrays;

class Solution2 {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int min = Integer.MAX_VALUE;
        // int m = grid.length;
        int n = grid[0].length;
        int ans[] = new int[n];
        for (int c = 0; c < n; c++) {
            ans[c] = helper(grid, moveCost, 0, c, min);
        }
        Arrays.sort(ans);

        return ans[0];

    }

    private int helper(int[][] grid, int[][] moveCost, int r, int c, int min) {
        if (r == grid.length - 1)
            return 0;
        int previous = grid[r][c];
        int cost = 0;
        int nextCol = 0;
        for (int col = 0; col < grid[0].length; col++) {
            int next = grid[r + 1][col];
            int pathCost = moveCost[previous][col];
            cost = previous + next + pathCost;
            if (cost < min) {
                min = cost;
                nextCol = col;

            }
        }

        return min + helper(grid, moveCost, r + 1, nextCol, Integer.MAX_VALUE);

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[][] grid = { { 5, 3 }, { 4, 0 }, { 2, 1 } };
        int[][] moveCost = { { 9, 8 }, { 1, 5 }, { 10, 12 }, { 18, 6 }, { 2, 4 }, { 14, 3 } };
        System.out.println(s.minPathCost(grid, moveCost));

    }
}
