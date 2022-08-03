import java.util.*;

/**
 * Pair
 */
class Pair {
    int a;
    int b;
    int sum;
    Pair(int a,int b , int sum){
        this.a=a;
        this.b=b;
        this.sum=sum;
    }

}

public class Deletions {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        PriorityQueue<Pair> max = new PriorityQueue<>((x,y)->y.sum-x.sum);

        for (int i = 0; i < bobValues.length; i++) {
            max.add(new Pair(aliceValues[i], bobValues[i], aliceValues[i]+bobValues[i]));

        }
        int alicePoints = 0, bobPoints = 0, ans = 0;
        while (max.size() > 0) {
            alicePoints+=max.poll().a;
            if(max.size()>0)
            bobPoints+=max.poll().b;            
        }
        ans = (alicePoints > bobPoints) ? 1 : (alicePoints == bobPoints) ? 0 : -1;
        return ans;
    }

}
