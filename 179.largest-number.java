// /*
//  * @lc app=leetcode id=179 lang=java
//  *
//  * [179] Largest Number
//  */

// // @lc code=start
// class Solution {
//     public static void main(String[] args) {
//         int[] arr = { 3,30,34,5,9};
//         System.out.println(largestNumber(arr));

//     }

//     public static String largestNumber(int[] arr) {
//         int l = arr.length;
//         for (int i = 0; i < l; i++) {
//             for (int j = 1; j < l - i; j++) {
//                 if (helper(arr[j], arr[j-1])) {
//                     swap(arr, j, j-1);
//                 }

//             }

//         }
//         String res = "";
//         for (int i = 0; i < l; i++) {
//             res += Integer.toString(arr[i]);
//         }
//         return res;

//     }

//     public static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     public static boolean helper(int a, int b) {
//         String p = Integer.toString(a),
//                 q = Integer.toString(b),
//                 first = p + q,
//                 second = q + p;
//         int i = 0, j = 0, l = first.length();
//         while (i < l && first.charAt(i) == second.charAt(j)) {

//             i++;
//             j++;

//         }
//         if (i == l)
//             return false;
//         if (second.charAt(j) - '0' < first.charAt(i) - '0')
//             return true;

//         return false;

//     }
// }
// // @lc code=end
