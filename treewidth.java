// import java.util.Arrays;
// import java.util.PriorityQueue;

// import Parents.TreeNode;

// public class treewidth {
//     public static int solve(int N, int a, int[] x) {
//         // code here
//         // int max = 0;

//         // for (int i = 0; i < x.length - 1; i++) {
//         //     // max = Integer.MIN_VALUE;
//         //     for (int j = i + 1; j < x.length; j++) {
//         //         max = Math.max(Math.abs(x[i] - a) + Math.abs(x[j] - a), max);

//         //     }
//         // }
//         // return max;

//         // Arrays.sort(x);
//         // int l=x.length-1;
//         // int first=Math.abs(x[0] - a) + Math.abs(x[1] - a) ;
//         // int last= Math.abs(x[l] - a) + Math.abs(x[l-1] - a);
        
        
//         // return Math.max(first,last);
//         PriorityQueue<Integer> max=new PriorityQueue<>((p,q)->q-p);
//         for (int i:x) {
//             int dif=Math.abs(i - a);
//             max.add(dif);
            
//         }
//         int sum=0;
//         for(int i=0;i<2;i++){
//             sum+=max.poll();
//         }
//         return sum;
        

//     }

//     public static void main(String[] args) {
//         int N = 12, a = 54;
//         int []x = {67, 32, 27, 22, 94, 17, 66, 57 ,60, 52, 73 ,49};
//         System.out.println(solve(N, a, x));
//     }
// }
