// public class Bipartite {
//     public static void main(String[] args) {
//         int[][] graphs = { { 1 }, { 0, 2 }, { 1, 3 }, { 2 } };
//         System.out.println(checkGraph(graphs));
//     }

//     private static boolean checkGraph(int[][] graphs) {
//         int[] color = new int[graphs.length];
//         // 0=uncoloured 1=Red -1= Black
//         // Gotta start intitialisation from 1 source vertex
//         color[0] = 1;

//         for (int i = 0; i < graphs.length; i++) {
//             if (color[i] != 0) {
//                 return dfsColoring(color, i, graphs);
//             }
//         }

//         return false;
//     }

//     private static boolean dfsColoring(int[] color, int i, int[][] graphs) {

//         for (int j = 0; j < graphs[i].length; j++) {
//             int newcolor = -color[i];
//             int target=graphs[i][j];

//             if (color[target] == 0) {
//                 color[target] = newcolor;

//               return  dfsColoring(color, target, graphs);

//             }

//             else if (color[target] == color[i])
//                 return false;

//         }
//         return true;
//     }

// }
