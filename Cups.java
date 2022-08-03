// import java.util.Arrays;

// public class Cups {
//     public static void main(String[] args) {
//         int[] nums = { 1, 4, 2 };
//         System.out.println(fillCups(nums));
//     }

//     public static int fillCups(int[] amount) {
//         int ans = 0;

//         while (!(amount[0] == 0 && amount[0]==amount[1] && amount[1]==amount[2] )  ){
//             int[] hottest = helper(amount);
//             ans++;
//             amount[hottest[0]]--;
//             amount[hottest[1]]--;

//         }
        
//         return ans;

//     }

//     private static int[] helper(int[] amount) {
//         int[] cups = new int[2];
//         if (amount[0] >= amount[1] && amount[0] >= amount[2]) {
//             cups[0] = 0;
//             cups[1] = (amount[1] >= amount[2]) ? 1 : 2;
//         } else if (amount[1] >= amount[0] && amount[1] >= amount[2]) {
//             cups[0] = 1;
//             cups[1] = (amount[0] >= amount[2]) ? 0 : 2;
//         } else {
//             cups[0] = 2;
//             cups[1] = (amount[0] >= amount[1]) ? 0 : 1;
//         }

//         return cups;
//     }

// }
