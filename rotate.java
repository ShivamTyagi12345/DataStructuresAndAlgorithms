import java.util.ArrayList;
import java.util.List;

/**
 * rotate
 */
public class rotate {

    public static void main(String[] args) {
        System.out.println(generate(3));

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // List<Integer> cur=new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // We have to create a new "current" list every itteration
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j) + pre.get(j - 1));
                }

            }
            pre = cur;
            res.add(pre);

        }

        return res;

    }

}