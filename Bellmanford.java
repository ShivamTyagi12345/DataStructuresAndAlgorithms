import java.util.Arrays;
// Bellman Ford algorithm helps us find the shortest path from a vertex to all other vertices of a weighted graph.
class Bellmanford {

    // a structure to represent a weighted edge in graph
    static class Edge {
        int src, dest, weight;
    }

    // a structure to represent a connected, directed and
    // weighted graph
    static class Graph {

        // V-> Number of vertices, E-> Number of edges
        int V, E;

        // graph is represented as an array of edges.
        Edge edge[];

    }

    // Creates a graph with V vertices and E edges
    static Graph createGraph(int V, int E) {
        Graph graph = new Graph();
        graph.V = V;
        graph.E = E;
        graph.edge = new Edge[graph.E];

        for (int i = 0; i < graph.E; i++) {
            graph.edge[i] = new Edge();
        }

        return graph;
    }

    // The main function that finds shortest distances
    // from src to all other vertices using Bellman-
    // Ford algorithm. The function also detects
    // negative weight cycle
    static boolean isNegCycleBellmanFord(Graph graph, int src) {
        // initialisation 
        int[] distances=new int[graph.E];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[src]=0;
        
        

        // relaxation = Relax all E edges |V|-1 times:: Copy THE EDGES and By how many times= Equal to number of vertices in total and we have 1 original copy already.. so how nmany times== |V|-1 times
        		for (int i = 1; i < graph.V-1; i++) {
                    for (int j = 0; j < graph.E; j++) {
                        int u= graph.edge[j].src;
                        int v= graph.edge[j].dest;
                        int weight=graph.edge[j].weight;
                        if(weight!=Integer.MAX_VALUE && distances[v]> distances[u]+weight){
                            distances[v]=distances[u]+weight;
                        }
                        
                    }
           
            
        }

        for (int i = 0; i < graph.E; i++) {
            int u = graph.edge[i].src;
            int v = graph.edge[i].dest;
            int weight = graph.edge[i].weight;
            if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v])
                return true;
        }
  
        return false;
		

	}

    // Driver Code
    public static void main(String[] args) {
        int V = 3, E = 3;
        Graph graph = createGraph(V, E);

        // add edge 0-1 (or A-B in above figure)
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -1;

        // add edge 1-2 (or B-C in above figure)
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -1;

        // add edge 2-0 (or D-C in above figure)
        graph.edge[2].src = 2;
        graph.edge[2].dest = 0;
        graph.edge[2].weight = -1;

        if (isNegCycleBellmanFord(graph, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
