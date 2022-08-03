import java.util.PriorityQueue;

public class maxRot {
    public static void main(String[] args) {
        int[] nums = { 100};
        System.out.println(maxRotateFunction(nums));
    }

    public static int maxRotateFunction(int[] nums) {
        int l = nums.length, p = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
        int[] mul = new int[l];

        // int dp[][]=new int [l+1][l+1];
        for (int i = 0; i < l; i++) {
            p += (i * nums[i]);
            mul[i] = i;
        }
        max.add(p);
        for (int r = 0; r < l - 1; r++) {
            p = 0;

            // for every iteration i have recreared array mul [0,1,2,3]
            // [1,2,3,0][2,3,0,1][3,0,1,2]
            for (int c = 0; c < l; c++) {
                mul[c] += 1;
                int item = mul[c];

                if (item >= l) {
                    item %= l;
                }
                p += (nums[c] * item);

            }
            max.add(p);

        }
        return max.poll();
    }
}
