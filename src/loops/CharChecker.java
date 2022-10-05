package loops;

import java.awt.datatransfer.ClipboardOwner;
import java.util.Scanner;

public class CharChecker {
    public  static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word  = scanner.nextLine();
        scanner.close();

        counter(word);
    }

    public static void counter(String str) {
        int counter = 0;

        // Traverse the character array
        for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 65 || str.charAt(i) == 97) {
                    counter++;
                }
        }
        System.out.println("The letter 'a' or 'A' appears " + counter+ " times");
    }
}
