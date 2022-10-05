package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInteger {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("The min value is: " +minValue(readElements(readInteger())));
    }

    public static  int readInteger(){
        System.out.println("How many elements would like to enter?");
        int count = scanner.nextInt();

        return count;
    }

    public static int[] readElements(int count) {
        int [] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int minValue(int[] array) {
        Arrays.sort(array);
        int minValue = array[0];

        return minValue;
    }
}
