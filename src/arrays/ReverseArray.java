package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {2,3,56,7,9,4};
        int[] array2 = {45,7,5,9,10};

        reverse(array1);
        reverse(array2);
    }

    public static void reverse(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {

            int current = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = current;

        }
        System.out.println(Arrays.toString((array)));
    }
}
