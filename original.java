import java.util.*;
import java.util.List;

public class original {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> max = new PriorityQueue<>((a, b) -> ((b[0] + b[1]) - (a[0] + a[1])));
        int m = nums1.length, n = nums2.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                max.add(new int[] { nums1[i], nums2[j] });
                if (max.size() > k)
                    max.poll();

            }

        }
        while (max.size() > 0) {
            List<Integer> list = Arrays.asList(max.peek()[0], max.peek()[1]);
            max.poll();
            ans.add(list);

        }
        return ans;

    }

}
