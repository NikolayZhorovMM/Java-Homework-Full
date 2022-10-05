package collections;

import java.util.List;

public class IterateCollection {
    public static void main(String[] args) {
        iterate();
    }

    public  static void iterate() {
        List<String> list= List.of("banana", "apple", "orange");
        list.forEach(x -> System.out.println(x));

        for(String value : list) {
            System.out.println(value);
        }
    }
}
