package statements;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your grade");
            int grade = Integer.parseInt((scanner.nextLine()));
            scanner.close();

            String charGrade;
        switch (grade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Grade is F");
                break;
            case 5:
                System.out.println("Grade is E");
                break;
            case 6:
                System.out.println("Grade is C");
                break;
            case 7:
            case 8:
                System.out.println("Grade is B");
                break;
            case 9:
                System.out.println("Grade is A");
                break;
            case 10:
                System.out.println("Grade is A+");
                break;
            default:
                System.out.println("Enter grade from 0 to 10");
        }




        } catch(Exception e){
            System.out.println("Grade must be a positive integer");
        }
    }
}
