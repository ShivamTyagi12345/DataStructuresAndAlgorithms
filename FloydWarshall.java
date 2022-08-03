
class FloydWarshall {

    static final int V = 4;

    static final int INF = 99999;

    // Returns true if graph has negative weight cycle
    // else false.
    static boolean negCyclefloydWarshall(int graph[][]) {

        int dist[][] = new int[V][V], i, j, k;

        // Make the adjacency matrix with right weights
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (k = 0; k < V; k++) {
            // k allocates the intermediarte vertex
            for (i = 0; i < V; i++) {

                for (j = 0; j < V; j++) {

                    // We put an intermediate vertex: [i][j]= [i][k]+[k][j]
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

    //[ONlY this ::]    // If distance of any vertex from itself
        // becomes negative, then there is a negative
        // weight cycle.
        for (i = 0; i < V; i++)
            if (dist[i][i] < 0)
                return true;

        return false;
    }

    // Driver code
    public static void main(String[] args) {

        /*
         * Let us create the following weighted graph
         * 1
         * (0)----------->(1)
         * /|\ |
         * | |
         * -1 | | -1
         * | \|/
         * (3)<-----------(2)
         * -1
         */

        int graph[][] = { { 0, 1, INF, INF },
                { INF, 0, -1, INF },
                { INF, INF, 0, -1 },
                { -1, INF, INF, 0 } };

        if (negCyclefloydWarshall(graph))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
