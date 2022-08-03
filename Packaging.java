import java.util.PriorityQueue;

/**
 * Packaging
 */

public class Packaging {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> boxes = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        
        for(int i = 0; i<boxTypes.length;i++)
            boxes.add(boxTypes[i]);
        
        int sum = 0;
        int boxCount = 0;
        while(boxCount<truckSize && boxes.size()>0)
        {
            int[] elem = boxes.poll();
            int numElements = Math.min(elem[0], truckSize - boxCount);
            sum += numElements * elem[1];
            boxCount += numElements;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
        int truckSize = 5;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }
}