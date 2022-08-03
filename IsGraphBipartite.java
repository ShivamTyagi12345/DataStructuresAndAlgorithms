import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsGraphBipartite {

    // O(v+e) time
    // O(v) space
    public static boolean isBipartite(int[][] graph) {
        if (graph == null || graph.length == 0) {
            return true;
        }
        // 0 = uncoloured, 1 = red, -1 = blue
        int[] colours = new int[graph.length];

        for (var v = 0; v < graph.length; v++) {

            if (colours[v] != 0) {
                continue;
            }
            if (!dfs(v, 1, graph, colours)) {
                return false;
//The graph is UnBipartite i.e Adjacent vertices are identically coloured

            }
        }

        return true;
        // the graph is Bipartite ie Adjacent vertices have opposite colouring
    }

    private static boolean dfs(int v, int colour, int[][] graph, int[] colours) {
// This function returns true if the Graph is Bipartite
        if (colours[v] != 0) {
            return colours[v] == colour;
            // This statement is called from inside the recursion.
            // False: The neighbours have Same colour--> This makes dfs() return false --> which eventually means the graph is Unbipartite coz, dfs() work is to say whether or Not the graph is Bipartite
            // True: They have different colours--> This makes dfs() return true --> which eventually means the graph id Bipartite
        }

        colours[v] = colour;

        for (int u : graph[v]) {
            var oppositeColour = -colour;
            if (!dfs(u, oppositeColour, graph, colours)) {
                return false;// Graph is UnBipartite
            }
        }

        return true;// Graph is Bipartite 
    }

    // O(v+e) time
    // O(v) space
    public static boolean isBipartite2(int[][] graph) {
        if (graph == null || graph.length == 0) {
            return true;
        }
        // 0 = uncoloured, 1 = red, -1 = blue
        int[] colours = new int[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {

            if (colours[i] != 0) {
                continue;
            }

            colours[i] = 1;
            s.add(i);

            while (!s.isEmpty()) {
                int v = s.pop();

                for (int u : graph[v]) {
                    if (colours[u] == 0) {
                        colours[u] = -colours[v];
                        s.add(u);
                    } else if (colours[u] == colours[v]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // O(v+e) time
    // O(v) space
    public static boolean isBipartite3(int[][] graph) {
        if (graph == null || graph.length == 0) {
            return true;
        }
        // 0 = uncoloured, 1 = red, -1 = blue
        int[] colours = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {

            if (colours[i] != 0) {
                continue;
            }

            colours[i] = 1;
            q.offer(i);

            while (!q.isEmpty()) {
                int v = q.poll();

                for (int u : graph[v]) {
                    if (colours[u] == 0) {
                        colours[u] = -colours[v];
                        q.offer(u);
                    } else if (colours[u] == colours[v]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] graph = { { 1 }, { 0, 3 }, { 3 }, { 1, 2 } };
        System.out.println( isBipartite(graph));

    }
}