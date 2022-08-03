import java.util.ArrayList;
import java.util.List;;

public class Dag {
  
   static List<List<Integer>> res = new ArrayList<>();

   public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      
    ArrayList<Integer> path = new ArrayList<>();
       dfs(path, 0, graph);
       return res;
   }

   public static void dfs(List<Integer> path, int i,int[][] graph) {
       
       if (i == graph.length - 1){
           path.add(i);
           res.add(new ArrayList<>(path));
           path.remove(path.size() - 1);
           return;
       }

       
       path.add(i);
       for (int j : graph[i]) {
           
           dfs(path, j, graph);
       }
      
       path.remove(path.size() - 1);

       return;
   }
public static void main(String[] args) {
    int[][] graph={{1,2},{3},{3},{}};
System.out.print(allPathsSourceTarget(graph));

}
    
}
