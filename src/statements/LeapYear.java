package statements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        String leapYear = "The year is a leap(it has 366 days)";
        String notLeapYear = "The year is not leap(it has 365 days)";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an year");
           int year = Integer.parseInt((scanner.nextLine()));
           scanner.close();

           boolean isLeap = isLeapYear(year);

           if(isLeap){
               System.out.println(leapYear);
           }
           else {
               System.out.println(notLeapYear);
           }


        } catch(Exception e){
            System.out.println("Year must be an integer");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0) {
                    isLeap = true;
                }
                else {
                    isLeap = false;
                }
            }
            else {
                isLeap = true;
            }
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }
}
