package methods.variables;

public class CapitalLoweChars {
    public static  void main(String[] args) {
        charsChecker('a');
        charsChecker('A');
        charsChecker('C');
        charsChecker('U');
        charsChecker('u');
    }

    public static void charsChecker(char letter) {
        if(letter >= 65 && letter <= 90) {
            System.out.println("Capital");
        }
        else if(letter >= 97 && letter<= 122){
            System.out.println("Lower");
        }
    }
}
