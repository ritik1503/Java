package Collections;

import java.util.*;

public class StackLearning {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("values in stack: " + stack);
        System.out.println("Peek at top element: " + stack.peek());
        stack.pop();
        System.out.println("values in stack after pop: " + stack);
    }
}
