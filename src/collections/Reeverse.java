package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Reeverse {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        reverseList(list);
    }

    public static void reverseList(ArrayList<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }
}
