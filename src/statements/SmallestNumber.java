package statements;

import java.util.Scanner;

public class SmallestNumber {
    public static void main (String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            double number1 = Double.parseDouble((scanner.nextLine()));

            System.out.println("Enter the second  number:");
            double number2 = Double.parseDouble((scanner.nextLine()));

            System.out.println("Enter the third number:");
            double number3 = Double.parseDouble((scanner.nextLine()));
            scanner.close();

            double smallestNum = getSmallestNumber(number1, number2, number3);
            // remove decimal if number is integer
            if ((smallestNum % 1) == 0) {
                System.out.println("Smallest number is: " + Math.round((smallestNum)));
            }else {
                System.out.println("Smallest number is: " + smallestNum);
            }



        } catch(Exception e){
            System.out.println("Numbers must be a number");
        }
    }

    public static double getSmallestNumber(double number1, double number2, double number3) {
        double smallest;

        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number3 && number2 <= number1) {
            smallest = number2;
        } else {
            smallest = number3;
        }
        return  smallest;
    }
}
