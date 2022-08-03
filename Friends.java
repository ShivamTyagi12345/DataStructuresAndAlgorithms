// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.List;

// public class Friends {
//     public static void main(String[] args) {

//     }

//     public static boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
//         // map to get the Enemies
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int[] is : restrictions) {
//             map.put(is[0], is[1]);
//             map.put(is[1], is[0]);
//         }

//         // Graph DS to store all the permissible connections
//         List<Integer>[] graph = new ArrayList[n];
//         for (int i = 0; i < n; i++)
//             graph[i] = new ArrayList<>();
//         for (int[] item : requests) {
//             int v1 = item[0],
//                     v2 = item[1];
//             graph[v1].add(v2);
//             graph[v2].add(v1);

//         }

//         // Do dfs for each request. If the path has the enemy we return false
//         boolean[] ans = new boolean[requests.length], vis = new boolean[n];

//         for (int[] request : requests) {
//             int src = request[0], enemy1 = map.get(src),
//                     dest = request[1], enemy2 = map.get(dest);
//             // if (dfs(src, dest, enemy1, enemy2, graph, vis)) {
//                 ans[src] = false;
//                 ans[dest] = false;
//             }
            

//         }

//     }

// }
