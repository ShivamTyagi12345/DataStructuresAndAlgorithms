class sam {
    public static void main(String[] args) {
        int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };

        System.out.println(equalPairs(grid));

    }

    public static int equalPairs(int[][] grid) {
        // number of pairs that have the same row and col
        int cl = grid[0].length, rl = grid.length, count = 0;
        for (int c = 0; c < cl; c++) {
            for (int r = 0; r < rl; r++) {
                if (grid[0][c] == grid[r][0]) {
                    int row = 1, col = 1;
                    boolean flag = true;
                    while (row < rl && col < cl) {
int x=grid[row][c],y=grid[r][col];
                        if (x==y) {
                            ++row;
                            ++col;
                        } else {
                            flag = false;
                            break;
                        }
                        if (row == rl  && col == cl  && flag)
                            count++;

                    }

                }

            }
        }
        return count;

    }
}