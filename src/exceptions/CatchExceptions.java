package exceptions;

import java.io.IOException;

public class CatchExceptions {
    public static void main(String[] args) {
        divideZero(5);
    }

    private static void divideZero(int num) {
        try {
            int test = num/0;
        }catch(Exception e) {
            System.out.println("You are not allowed to divide by zero");
            e.printStackTrace();
        }
    }
}
