package statements;

import java.util.Scanner;

public class IntegerChecker {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            int number = Integer.parseInt((scanner.nextLine()));
            scanner.close();
            checkIntegerType(number);




        } catch(Exception e){
            System.out.println("Number must be an integer");
        }
    }

    public static void checkIntegerType(int number) {
        if(number < 0) {
            System.out.println("Negative");
        }
        else if(number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }
}
