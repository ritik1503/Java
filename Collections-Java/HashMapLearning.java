package Collections;

import java.util.*;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);
        map.put("Key3", 300);
        System.out.println("values in map: " + map);
        System.out.println("Value for Key1: " + map.get("Key1"));
        map.remove("Key2");
        System.out.println("values in map after removing Key2: " + map);
    }
}
