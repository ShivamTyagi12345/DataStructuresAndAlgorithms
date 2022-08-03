// import java.util.ArrayList;
// import java.util.List;;

// public class Detonate {
//     public static void main(String[] args) {
//         int[][] bombs= {{2,1,3},{6,1,4}};
//         System.out.println(maximumDetonation(bombs));
//     }
//   static  int max = Integer.MIN_VALUE;
//     int count = 0;

//     public  static int maximumDetonation(int[][] bombs) {
//         int l = bombs.length;

//         List<Integer>[] graphs = new List[l];
//         for (int i = 0; i < l; i++) {
//             graphs[i] = new ArrayList<>();
//         }
//         for (int i = 0; i < l - 1; i++) {
//             int x1 = bombs[i][0], y1 = bombs[i][1], r1 = bombs[i][2];
//             for (int j = i + 1; j < l; j++) {
//                 int x2 = bombs[j][0], y2 = bombs[j][1], r2 = bombs[j][2];
//                 int dis = Math.abs((int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
//                 if (dis < Math.abs(r1 + r2)) {
//                     graphs[i].add(j);
//                     graphs[j].add(i);
//                 }

//             }

//         }


//     //     // Detonation with simple Dfs

//     //     boolean vis[] = new boolean[l];

//     //     for (int i = 0; i < l; i++) {
//     //         if (!vis[i]) {
//     //             count = dfs(vis, graphs, i);

//     //             max = Math.max(max, count);
//     //         }

//     //     }

//     //     return max;
//     // }

//     // private int dfs(boolean[] vis, List<Integer>[] graphs, int i) {
//     //     vis[i]=true;
//     //     for (int it : graphs[i]) {
            

            
//     //     }

//     //     return 0;
//     // }

// int [] arr=new int[l];
//  for (int i = 0; i < l; i++) {
//     arr[i]= graphs[i].size();
//     max=Math.max(arr[i], max);
    
//  }
//  return max;
// }
// }
