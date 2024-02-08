package collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

