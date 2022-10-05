package collections;

import java.util.HashMap;

public class CopyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("banana", 34);
        map1.put("orange", 324);
        map1.put("fruit", 1);
        HashMap<String, Integer> map2 = new HashMap<>();

        copyMap(map1, map2);

    }

    public static void copyMap(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        map2.putAll(map1);

        map1.forEach((k,v) -> System.out.println("First map "+k+" : "+v));
        map2.forEach((k,v) -> System.out.println("Second map "+k+" : "+v));
    }
}
