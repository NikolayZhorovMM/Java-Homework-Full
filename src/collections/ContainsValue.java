package collections;

import java.util.HashMap;

public class ContainsValue {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("banana", "good");
        map.put("orange", "ok");
        map.put("fruit", "nice");

        System.out.println("Exist -> " + isExist(map, "nice"));
        System.out.println("Exist -> " + isExist(map, "like"));
    }

    public static boolean isExist(HashMap<String, String> map, String value) {
        return map.containsValue(value);
    }
}
