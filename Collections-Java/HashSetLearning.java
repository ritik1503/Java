package Collections;

import java.util.*;

public class HashSetLearning {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("values in set: " + set);
        System.out.println("Set contains A? " + set.contains("A"));
        set.remove("B");
        System.out.println("values in set after removing B: " + set);
    }
}
