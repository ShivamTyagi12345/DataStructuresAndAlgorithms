package day4;

import java.util.*;

class Solution {
    public int solveNQueens(int n) {

        boolean[][] arr = new boolean[n][n];
        int row = 0;

        // print the array by Putting "Q" or "."
        return queens(arr, row);
    }

    boolean helper(boolean[][] arr, int r, int c) {
        // changes made in the square

        int L = Math.min(r, c);
        int R = Math.min(r, arr.length - c - 1);

        // left upper diagonal check
        for (int i = 1; i <= L; i++) {
            if (arr[r - i][c - i]) {
                return false;

            }

        }

        // upper check
        for (int i = 0; i < r; i++) {
            if (arr[i][c]) {
                return false;

            }
        }

        // uppper right diagonal check
        for (int i = 1; i <= R; i++) {
            if (arr[r - i][c + i]) {
                return false;

            }

        }

        return true;

    }

    public int queens(boolean[][] arr, int row) {

        if (row == arr.length) {
            return 1;
        }
        int ans = 0;
        for (int col = 0; col < arr.length; col++) {

            if (helper(arr, row, col)) {
                arr[row][col] = true;
                ans = ans + queens(arr, row + 1);

                // reverting the changes for future calls
                arr[row][col] = false;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solveNQueens(4));

    }
}
