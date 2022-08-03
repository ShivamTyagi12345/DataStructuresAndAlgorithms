import java.util.Arrays;

// import javax.swing.text.Position;

public class Nearest {
    public int[][] updateMatrix(int[][] mat) {
        int nc = mat[0].length, nr = mat.length;

        int[][] ans = new int[nr][nc];
        Arrays.fill(ans, 0);
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (mat[i][j] == 0)
                    ans[i][j] = 0;
                else
                 nearestZero(mat, ans, i, j);

            }

        }
        return ans;
    }

    private void nearestZero(int[][] mat, int[][] ans, int r, int c) {
        if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length)
            return;

        // recursion calls will see if the further calls and check CASE 1: it sees a 0
        // CASE 2: It sees a 1
        // Case1: return 1
        if (mat[r][c] == 0)
            ans[r][c]=1;
        // Case2: look for the value that's awarded to it from dp Array
        else{
            
        }
        nearestZero(mat, ans, r - 1, c);
        nearestZero(mat, ans, r + 1, c);
        nearestZero(mat, ans, r, c - 1);
        nearestZero(mat, ans, r, c + 1);

        // return 0;  
    }
}
