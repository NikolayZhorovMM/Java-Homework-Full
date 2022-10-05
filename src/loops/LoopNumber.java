package loops;

import java.util.Scanner;

public class LoopNumber {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = Integer.parseInt((scanner.nextLine()));
        scanner.close();
        if(number >= 1) {
            printNumbers(number);
        } else {
            System.out.println("Enter a positive number!");
        }

    }

    public  static void printNumbers(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
