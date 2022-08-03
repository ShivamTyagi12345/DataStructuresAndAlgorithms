// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.PriorityQueue;

// public class sum {
//     public static void main(String[] args) {
//         int[] nums = { 10,12,19,14};
//         System.out.println(maximumSum(nums));
//     }

//     public static int maximumSum(int[] nums) {
//         int l = nums.length, s = 0, e = l - 1, sum = 0;
//         // Arrays.sort(nums);
//         PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
//         // while(s<e){
//         // int a=nums[s],b=nums[e];
//         // if(dig(a)==dig(b)){
//         // max.add(a+b);
//         // s++;
//         // e--;
//         // }
//         // else if(a<b)s++;
//         // else e--;

//         // }

//         // for (int i = 0; i < l - 1; i++) {
//         // for (int j = i + 1; j < l; j++) {
//         // int a = nums[i], b = nums[j];
//         // if (dig(a) == dig(b)) {
//         // max.add(a + b);

//         // }

//         // }
//         // }

//         List<Integer>[] map = new List[10];
//         for (int i = 0; i <= 9; i++) {
//             map[i] = new ArrayList<>();
//         }

//         for (int i : nums) {
//             int digitSum = dig(i);
//             while (digitSum >= 10) {
//                 digitSum = dig(digitSum);

//             }
//             map[digitSum].add(i);

//         }

//         for (List<Integer> list : map) {
//             int size=list.size();
//             if(size>1){
//                 for (int i=0;i<size-1;i++) {
//                     for (int j = i+1; j < size; j++) {
//                         int a= list.get(i),b=list.get(j);
//                         max.add(a+b);
                        
//                     }
                    
//                 }
//             }
            
//         }

//         return max.size() > 0 ? max.poll() : -1;

//     }

//     private static int dig(int a) {
//         int m = a, n, sum = 0;
//         while (m > 0) {
//             n = m % 10;
//             sum = sum + n;
//             m = m / 10;
//         }
//         return sum;
//     }

// }
