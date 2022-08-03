// import java.util.Arrays;

// class Solution {
//     long[][] memo = new long[100001][100001];

//     public long maximumSubsequenceCount(String text, String pattern) {
//         for (long[] is : memo) {
//             Arrays.fill(is, -1);

//         }
//         String first = pattern.charAt(0) + text;
//         String last = text + pattern.charAt(1);
//         return (long) Math.max(count(first, pattern),
//                 count(last, pattern));

//     }

//     // public long lcs_Count(String Big, String small, int bl, int sl) {
//     // // already calculated
//     // if (memo[bl][sl] != -1)
//     // return memo[bl][sl];

//     // // new calculation

//     // if ((bl == 0 && sl == 0) || sl == 0)
//     // return memo[bl][sl] = 1;
//     // if (bl == 0)
//     // return memo[bl][sl] = 0;
//     // if (Big.charAt(bl - 1) == small.charAt(sl - 1)) {
//     // return memo[bl][sl] = lcs_Count(Big, small, bl - 1, sl - 1) + lcs_Count(Big,
//     // small, bl - 1, sl);
//     // } else
//     // return memo[bl][sl] = lcs_Count(Big, small, bl - 1, sl);

//     // }
//     public int count(String a, String b) {
//         int m = a.length();
//         int n = b.length();

//         // Create a table to store
//         // results of sub-problems
//         int lookup[][] = new int[m + 1][n + 1];

//         // If first string is empty
//         for (int i = 0; i <= n; ++i)
//             lookup[0][i] = 0;

//         // If second string is empty
//         for (int i = 0; i <= m; ++i)
//             lookup[i][0] = 1;

//         // Fill lookup[][] in
//         // bottom up manner
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 // If last characters are
//                 // same, we have two options -
//                 // 1. consider last characters
//                 // of both strings in solution
//                 // 2. ignore last character
//                 // of first string
//                 if (a.charAt(i - 1) == b.charAt(j - 1))
//                     lookup[i][j] = lookup[i - 1][j - 1] +
//                             lookup[i - 1][j];

//                 else
//                     // If last character are
//                     // different, ignore last
//                     // character of first string
//                     lookup[i][j] = lookup[i - 1][j];
//             }
//         }

//         return lookup[m][n];
//     }
// }