package statements;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        try {
            boolean isEligible = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter marks in Math:");
            int math = Integer.parseInt((scanner.nextLine()));

            if(mathChecker(math)) {
                System.out.println("Enter marks in Biology:");
                int biology = Integer.parseInt((scanner.nextLine()));
                /**
                 * can be checked in the last condition
                 */
                if(biologyChecker(biology) && mathBiologyChecker(math, biology)) {
                    System.out.println("Enter marks in Chem:");
                    int chem = Integer.parseInt((scanner.nextLine()));
                    scanner.close();

                    if(chemChecker(chem)) {
                        if( totalChecker(math, biology, chem)) {
                            isEligible = true;
                        }
                    }

                }
            }

            if(isEligible) {
                System.out.println("Is Eligible");
            }
            else {
                System.out.println("Is not Eligible");
            }


        } catch (Exception e) {
            System.out.println("Enter a positive integer");
        }
    }

    public  static boolean mathChecker(int math) {
        if(math >= 65) {
            return true;
        }
        return  false;
    }
     public static boolean biologyChecker(int biology) {
        if(biology >= 55) {
            return true;
        }
        return false;
     }

     public static boolean chemChecker(int chem) {
        if(chem >= 50) {
            return  true;
        }
        return  false;
     }

     public static boolean totalChecker(int math, int biology , int chem ) {
        if(chem + math + biology >= 180) {
            return true;
        }
        return  false;
     }

     public static boolean mathBiologyChecker(int math, int biology) {
        if(math + biology >= 140) {
            return  true;
        }
        return  false;
     }
}
