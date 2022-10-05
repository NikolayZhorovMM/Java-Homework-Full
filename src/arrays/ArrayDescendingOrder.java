package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescendingOrder {
    private static Scanner scanner = new Scanner(System.in);
    private static int arrSize;
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to sort?");
        arrSize = scanner.nextInt();

        printArray(sortInteger(getIntegers(arrSize)));
    }

    public  static int[] getIntegers(int arrSize) {
        int [] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

   public  static  int[] sortInteger(int[] array){
        int[] sorted = new int[array.length];
        Arrays.sort(array);
       for (int i = 0; i < array.length; i++) {
           /***
            * sort descending
            */
           sorted[array.length-i-1] = array[i];
       }
       return sorted;
   }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }
}
