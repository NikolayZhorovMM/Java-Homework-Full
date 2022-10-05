package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static  void main(String[] args) {
        boolean isPrimeNum = false;
        Scanner scanner = new Scanner(System.in);
        int randomNumber = randomNumberGenerator();
        boolean isMatch = false;

        System.out.println("Enter an integer from 1 to 10:");
        do {

            int userNumber = Integer.parseInt(scanner.nextLine());

            if(userNumber == randomNumber) {
                isMatch = true;
                System.out.println("Success!");
                scanner.close();
            }
            else if(userNumber <= 0 || userNumber > 10) {
                System.out.println("Enter an integer from 1 to 10:");
            }
            else {
                checkLowerHigher(randomNumber, userNumber);
            }


        } while (isMatch != true);
    }

    public static  int randomNumberGenerator() {
        Random random = new Random();
        int num = random.nextInt(10);
        return num;
    }

    public static void checkLowerHigher(int randomNumber,int userNumber) {
        if(randomNumber > userNumber) {
            System.out.println("Too low, try again");
        }
        else {
            System.out.println("Too high, try again ");
        }
    }
}
