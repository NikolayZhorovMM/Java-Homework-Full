package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static  void main(String[] args) {
        boolean isPrimeNum = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter prime number:");
            int number = Integer.parseInt(scanner.nextLine());

           isPrimeNum = isPrime(number);
           if(isPrimeNum) {
               System.out.println(number+ " is prime");
               scanner.close();
           }

        } while (isPrimeNum != true);
    }

    public static boolean isPrime(int number) {
        if(number < 2 ) {
            return false;
        }

        for (int i = 2; i <= number/2 ; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return  true;
    }
}
