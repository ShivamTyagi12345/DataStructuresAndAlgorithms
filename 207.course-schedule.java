import java.util.ArrayList;

/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution{
    public static void main(String[] args) {
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        int numCourses = 2;
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();

        }

        for (int[] i : prerequisites) {
            int a = i[0], b = i[1];
            graph[b].add(a);

        }
        boolean[] vis = new boolean[numCourses];
        boolean[] dfsvis = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfs_cycle(vis, dfsvis, graph, i))
                    // checks if there is a cycle in the directed graph using dfs
                    return false;

            }

        }
        return true;

    }

    private static boolean dfs_cycle(boolean[] vis, boolean[] dfsvis, ArrayList<Integer>[] graph, int i) {
        vis[i] = true;
        dfsvis[i] = true;
    
        for (int it : graph[i]) {
            if (!vis[it]) {
                if (dfs_cycle(vis, dfsvis, graph, it)) {
                    return true;

                }
            } else if (vis[it] && dfsvis[it]) {
                return true;
            }
        }

        dfsvis[i] = false;
        return false;
    }
}
// @lc code=end
