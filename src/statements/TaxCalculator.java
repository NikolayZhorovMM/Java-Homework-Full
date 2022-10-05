package statements;

import java.util.Scanner;

public class TaxCalculator {
    public  static void main(String args[]) {
        System.out.println("Enter amount of money:");
        try {
            Scanner scanner = new Scanner(System.in);

            double money =
                    Double.parseDouble((scanner.nextLine()));
            scanner.close();

            if(money > 0 && money < 20000) {
                double tax = money * 0.05;
                System.out.printf("Total tax is: $"+ String.format("%.2f",tax));

            }
            else if(money >= 20000 && money <= 50000) {
                double tax = money * 0.10;
                System.out.printf("Total tax is: $"+ String.format("%.2f",tax));
            }
            else if (money > 50000){
                double tax = money * 0.20;
                System.out.printf("Total tax is: $"+ String.format("%.2f",tax));
            }
            else {
                System.out.println("The number must be bigger than 0!");
            }
        } catch(Exception e){
            System.out.println("Only real numbers are required!");
        }
    }
}
