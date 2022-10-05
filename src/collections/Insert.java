package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        insertAtIndex(3, 5, list);
        insertAtIndex(3, 10, list);

    }

    public static void insertAtIndex(int index, int num, List<Integer> list){
        if(list.size() >= index){
            list.add(index,num);
        }

        list.forEach(x -> System.out.println(x));
    }
}
