/**
 * doubles
 */
public class doubles {

    static int ans = 0;

    public static void main(String[] args) {
        System.out.println(minMoves(19, 2));
    }

    public static int minMoves(int n, int maxDoubles) {
        if(n==1) return 0;
        if (maxDoubles == 0)
            return n - 1;
        if (maxDoubles > 0 ) {
            if (n % 2 == 0)
                ans = 1 + minMoves(n / 2, maxDoubles-1);
            else
                ans = 1 + minMoves(n -1, maxDoubles);
        }

        return ans;
    }
}
