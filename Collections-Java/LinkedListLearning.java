package Collections;

import java.util.*;

public class LinkedListLearning {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("First");
        deque.add("Second");
        deque.addLast("Last");
        System.out.println("values in deque: " + deque);
        deque.removeFirst();
        System.out.println("values in deque after removing first: " + deque);
    }
}
