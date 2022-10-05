package collections;

import java.util.HashMap;

public class PrintMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 1);
        map.put("orange", 2);
        map.put("fruit", 3);

        print(map);
    }

    public static void print(HashMap<String, Integer> map) {
        map.forEach((k,v) -> System.out.println("Key -> "+k+", Value -> "+v));
    }
}
