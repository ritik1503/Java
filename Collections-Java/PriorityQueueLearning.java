package Collections;

import java.util.*;

public class PriorityQueueLearning {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        System.out.println("values in queue: " + queue);
        System.out.println("Head of queue: " + queue.peek());
        queue.poll();
        System.out.println("values in queue after poll: " + queue);
    }
}
