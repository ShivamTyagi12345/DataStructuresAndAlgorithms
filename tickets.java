import java.util.LinkedList;
import java.util.Queue;

public class tickets {
    public static void main(String[] args) {
        int[] tickets = { 84, 49, 5, 24, 70, 77, 87, 8 };
        int k = 3;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != 0)
                q.offer(new int[]{i,tickets[i]});

        }

        while(!q.isEmpty()){
            int[] p=q.peek();
            q.poll();
            p[1]--;
            ans++;
            if(p[1]==0 && p[0]==k){
                break;
            }
            if(p[1]!=0){
                q.offer(p);
            }
        }
        return ans;

    }
}
