import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();// Directly make a stack
        // push
        stack.add(1);
        // pop
        stack.pop();
        // empty
        stack.size();
        // front
        stack.peek();


        //queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);// Push
        queue.peek(); // Front
        queue.poll(); // poll
        queue.size(); // Empty

        // Priorrity Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // push
        pq.add(1);
        // poll
        pq.poll();
        // empty
        pq.size();
        // first
        pq.peek();
    }

}
