package day4.graphs;

// Adjascency List representation in Java

import java.util.*;

class ad {

    // Add edge
    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            am.add(new ArrayList<Integer>());

        // Add edges
        addEdge(am, 0, 1);
        addEdge(am, 0, 2);
        addEdge(am, 0, 3);
        addEdge(am, 1, 2);
        // printGraph(am);

        int[] vis = new int[V];
        Arrays.fill(vis, 0);

        dfs(am, 0, vis);
        detectcycle(am, vis, 0, -1);
        topologicalsort(am, vis);
    }

    private static void topologicalsort(ArrayList<ArrayList<Integer>> am, int[] vis) {
        int V = am.size();
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < am.get(i).size(); j++) {
                indegree[am.get(i).get(j)]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.remove();
            System.out.print(u + " ");
            for (int i = 0; i < am.get(u).size(); i++) {
                indegree[am.get(u).get(i)]--;
                if (indegree[am.get(u).get(i)] == 0) {
                    q.add(am.get(u).get(i));
                }
            }
        }

    }

    private static void detectcycle(ArrayList<ArrayList<Integer>> am, int[] vis, int vertex, int parent) {
        // function to detect cycle in graph
        vis[vertex] = 1;
        for (int i = 0; i < am.get(vertex).size(); i++) {
            int v = am.get(vertex).get(i);
            if (vis[v] == 1 && v != parent) {
                System.out.println("Cycle detected");
                return;
            } else if (vis[v] == 0) {
                detectcycle(am, vis, v, vertex);
            }

        }

    }

    private static void dfs(ArrayList<ArrayList<Integer>> am, int i, int[] vis) {
        vis[i] = 1;
        System.out.println("Vertex " + i);
        for (int j = 0; j < am.get(i).size(); j++) {
            if (vis[am.get(i).get(j)] == 0) {
                dfs(am, am.get(i).get(j), vis);
            }
        }

    }

    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }

    }
}