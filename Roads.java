package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Roads {
    long sum = 0;

    public long maximumImportance(int n, int[][] roads) {
        // n = 5, roads = [[0,3],[2,4],[1,3]]
        List<List<Integer>> adj = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for (int[] road : roads) {
            adj.get(road[0]).add(road[1]);
            adj.get(road[1]).add(road[0]);

        }
        for (int index = 0; index < n; index++) {
            int e = adj.get(index).size();
            maxHeap.add(e);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean vis[] = new boolean[n];
        int k = n;
        while (maxHeap.size() > 0) {
            map.put(k--, maxHeap.poll());
        }

        return dfs(0, map, adj, vis);

    }

    private long dfs(int i, HashMap<Integer, Integer> map, List<List<Integer>> adj, boolean[] vis) {
        vis[i] = true;

        for (int j = 0; j < adj.get(i).size(); j++) {
            int element = adj.get(i).get(j);
            int weight = map.get(element);
            if (!vis[element]) {
                sum = +dfs(adj.get(i).get(j), map, adj, vis);

            }

        }

        return 0;
    }

    public static void main(String[] args) {
        Roads roads = new Roads();
        roads.maximumImportance(5, new int[][] { { 0, 3 }, { 2, 4 }, { 1, 3 } });

    }
}
