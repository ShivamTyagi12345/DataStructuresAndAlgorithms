
// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class cycle {

//     public static void main(String[] args) {

//         int V = 6;
//         ArrayList<ArrayList<Integer>> graph = new ArrayList<>(V);

//         // Vertex - 0
//         ArrayList<Integer> neighbors = new ArrayList<Integer>();
//         neighbors.add(1);
//         graph.add(neighbors);

//         // Vertex - 1
//         neighbors = new ArrayList<Integer>();
//         neighbors.add(2);

//         graph.add(neighbors);

//         // Vertex - 2
//         neighbors = new ArrayList<Integer>();
//         neighbors.add(0);
//         graph.add(neighbors);

//         if (isCyclic(V, graph))
//             System.out.println("Cycle detected");
//         else
//             System.out.println("No cycles detected");

//     }

//     private static boolean checkCycle(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int dfsVis[]) {
//         vis[node] = 1;
//         dfsVis[node] = 1;

//         for (Integer neighbor : adj.get(node)) {
//             if (vis[neighbor] == 0) {
//                 if (checkCycle(neighbor, adj, vis, dfsVis) == true) {
//                     return true;
//                 }
//             } else if (dfsVis[neighbor] == 1) {
//                 return true;
//             }
//         }
//         dfsVis[node] = 0;
//         return false;
//     }

//     public static boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {
//         int vis[] = new int[N];
//         int dfsVis[] = new int[N];

//         for (int i = 0; i < N; i++) {
//             if (vis[i] == 0) {
//                 if (checkCycle(i, adj, vis, dfsVis) == true)
//                     return true;
//             }
//         }
//         return false;
//     }
// }