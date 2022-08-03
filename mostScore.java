// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;

// public class mostScore {
//     public static void main(String[] args) {
//         int[] nums = { 0, 0,  0 };
//         System.out.println(maxScoreIndices(nums));
//     }

//     public static List<Integer> maxScoreIndices(int[] nums) {

//         int[] map=new int[2];
//         // Contains Only 0 and 1 as keys and their count as values
//         for (int i : nums) {
            
//             if(i==0)map[0]++;
//             else map[1]++;

//         }
//         // System.out.println(map);
//         List<Integer> ans = new ArrayList<>();
//         int l = nums.length;

//         // HashMap<Integer, Integer> sum = new HashMap<>();
//         // // contains the sum of zeros and ones in left and right arrays
//         // sum.put(0, map.get(1));
//         // sum.put(l - 1, map.get(0));

//         int[] dp = new int[l+1];

//         dp[l] = map[0];
//         int[] zero = new int[l + 1];
//         // zeros in left
//         int[] one = new int[l + 1];
//         // 1 in right
//         zero[0] = 0;
//         one[0] = map[1];

//         for (int i = 0; i < l; i++) {
//             if (nums[i] == 0) {
//                 zero[i + 1] = zero[i] + 1;
//                 one[i + 1] = one[i];

//             } else {
//                 zero[i + 1] = zero[i];
//                 one[i + 1] = one[i] - 1;
//             }

//             dp[i] = zero[i] + one[i];

//         }
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < dp.length; i++) {
//             max = Math.max(dp[i], max);

//         }

//         for (int i = 0; i < dp.length; i++) {
//             if(dp[i]==max)
//             ans.add(i);
            
//         }

//         return ans;

//     }
// }
