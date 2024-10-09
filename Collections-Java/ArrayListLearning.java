package Collections;

import java.util.*;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("values in list" + list);
        System.out.println("List contains 1 or not ? " + list.contains(1));
        list.remove(2);
        System.out.println("values in list after removing element at index 2 : " + list);
        //use .get(index) to get value at specific index
    }
}

