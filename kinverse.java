public class kinverse {
    public int kInversePairs(int n, int k) {
        int MOD = 100000007;
        int[][] dp = new int[n + 1][k + 1];
        // columns are 'n' and Rows are 'k'
        // We move : n=1 > Test it for all possible k then n=2 > Test it for all value
        // of k
        for (int c = 1; c < n + 1; c++) {
            for (int r = 0; r < k + 1; r++) {
                if (r == 0)
                    dp[0][c] = 1;
                else {
                    // consider exactly 'coloumn-number' elements from previous column to find the
                    // value of dp[r][c]
                   
                    for (int past = 0; past <=Math.min(r,c-1); past++) {
                        dp[r][c] =( dp[r][c] +dp[r-past][c - 1])% MOD;

                    }

                }

            }
        }
        return dp[n][k];

    }
}
