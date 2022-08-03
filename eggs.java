// import java.util.Arrays;

// class Solution {
//     int[][] mem = new int[1001][3];

//     public int twoEggDrop(int n) {
//         for (int[] is : mem) {
//             Arrays.fill(is, -1);

//         }

//         return helper(2, n);

//     }

//     int min = Integer.MAX_VALUE;

//     private int helper(int e, int n) {
//         // previously
//         if (mem[e][n] != -1)
//             return mem[e][n];

//         // new calculation
//         if (n == 0 || n == 1)
//             return mem[e][n] = n;
//         if (e == 1)
//             return mem[e][n] = n;
//         int temp = 0;
//         for (int k = 1; k <= n; k++) {
//             temp = 1 + Math.max(helper(e - 1, k - 1), helper(e, n - k));
//             if (temp < min)
//                 min = temp;
//         }
//         return mem[e][n] = min;
//     }
// }