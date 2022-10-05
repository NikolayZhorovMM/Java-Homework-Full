package collections;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("orange");

        String element = "orange";

        System.out.println("Element exist -> "+  searchElement(list, element));
        System.out.println("Element exist -> "+  searchElement(list, "car"));

    }

    public static boolean searchElement(List<String> list, String element ) {
        for (String item : list) {
            if(item == element) {
                return true;
            }
        }
        return false;
    }
}
