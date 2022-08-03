// import java.util.Arrays;

// public class swap {
//     public static void main(String[] args) {
//         int[] nums = { 0,1,1,1,0,0,1,1,0 };
//         System.out.println(minSwaps(nums));
//     }

//     public static int minSwaps(int[] nums) {
//         int l = nums.length,

//                 windowSize = 0;
//         // System.out.println("l=" + l);
//         for (int i : nums) {
//             if (i == 1)
//                 windowSize++;

//         }

//         // int [] ans=new int[windowSize];
//         // for(int i=0; i<=l-windowSize;i++){
//         // // System.out.println(new int[]{nums[i]});
//         // for (int j = 0; j < windowSize; j++) {
//         // ans[j]=nums[i];

//         // }
//         // System.out.println(Arrays.toString(ans)+"/////");

//         // }

//         // first 3 elements
//         int swaps = 0, min = Integer.MAX_VALUE;
//         for (int i = 0; i < windowSize; i++)
//             if (nums[i] == 0)
//                 swaps++;
//         min = swaps;

//         // sliding in circular array
//         for (int e = 1; e <= l ; e++) {

//             if (nums[e - 1] == 0) {
//                 swaps -= 1;

//             }
//             if (e + windowSize - 1<l && nums[e + windowSize - 1] == 0) {
//                 swaps += 1;
//             }else if(e + windowSize - 1>=l){
//                 int index=(e + windowSize - 1)%l;
//                 if(nums[index]==0)
//                 swaps+=1;

//             }
//             min = Math.min(min, swaps);

//         }

//         return min;

//     }
// }
