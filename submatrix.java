// import java.util.HashMap;

// public class submatrix {
//     // Using a 2D prefix sum, we can query the sum of any submatrix in O(1) time.
//     // Now for each (r1, r2), we can find the largest sum of a submatrix that uses
//     // every row in [r1, r2] in linear time using a sliding window.
//     public int numSubmatrixSumTarget(int[][] matrix, int target) {
//         int m = matrix.length, n = matrix[0].length;
        
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = (j == 0 ? matrix[i][j] : matrix[i][j - 1] + matrix[i][j]);
//             }
//         }
        
//         int res = 0;
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 HashMap<Integer, Integer> map = new HashMap<>();
//                 map.put(0, 1);
//                 int sum=0;

                
//             }
            
//          }

//     }

// }
