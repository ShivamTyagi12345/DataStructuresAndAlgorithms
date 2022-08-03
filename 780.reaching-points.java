/*
 * @lc app=leetcode id=780 lang=java
 *
 * [780] Reaching Points
 */

// @lc code=start
class Solution{
    public static void main(String[] args) {
        System.out.println(reachingPoints(1, 1, 3, 5));

    }

    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        int[][] grid = new int[tx + 1][ty + 1];
        return helper(sx, sy, tx+1, ty+1,grid);
    }

    private static boolean helper(int r, int c, int R, int C, int[][] grid) {

        if (r == R-1 && c == C-1)
            return true;
        if (r < 0 || r >= R || c < 0 || c >= C || grid[r][c] == -1)
            return false;
        grid[r][c] = -1;
        boolean left = helper(r + c, c, R, C, grid);
        boolean right = helper(r, c + r, R, C, grid);
        grid[r][c] = 0;
        return left || right;
    }
}
// @lc code=end
