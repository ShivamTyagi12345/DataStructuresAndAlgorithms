// import java.util.ArrayList;
// import java.util.List;

// public class processed {
//     public long mostPoints(int[][] questions) {

//         List<Integer> processed = new ArrayList<>();
//         List<Integer> unprocessed = new ArrayList<>();
//         for (int[] mark : questions) {
//             unprocessed.add(mark[0]);

//         }
//         long ans = helper(processed, unprocessed);
//         return ans;

//     }

//     private long helper(List<Integer> processed, List<Integer> unprocessed) {
//         if (unprocessed.size() == 0) {
//             long sum = 0;
//             for (int integer : processed) {
//                 sum += integer;
//             }
//             return sum;
//         }
//         long left = helper(processed, unprocessed.subList(1, unprocessed.size() - 1));
//         processed.add(unprocessed.get(0));
//         long right = helper(processed, unprocessed.subList(1, unprocessed.size() - 1));
//         return right;

        
//     }

// }
