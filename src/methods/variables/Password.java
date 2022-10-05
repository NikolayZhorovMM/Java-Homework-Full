package methods.variables;

public class Password {
    public static void main(String[] args) {
        System.out.println("Your password is valid -> "+ passwordValidation("pasworddZ120"));
        System.out.println("Your password is valid -> "+ passwordValidation("pasword12aaZ"));
        System.out.println("Your password is valid -> "+ passwordValidation("pasword1Z"));
        System.out.println("Your password is valid -> "+ passwordValidation("paswor"));
        System.out.println("Your password is valid -> "+ passwordValidation("111111111"));
        System.out.println("Your password is valid -> "+ passwordValidation("11111"));
        System.out.println("Your password is valid -> "+ passwordValidation("pasworddZ120_"));

    }

    public static boolean passwordValidation(String password) {
        boolean isValid = false;
        if(password.length() >= 8 && password.length() <= 16 ) {
            if(capitalLetterValidation(password)) {
                if(digitsValidation(password)) {
                    if(letterNumbersValidation(password)){
                        isValid = true;
                    }
                }
            }
        }
        return  isValid;
    }

    public static boolean capitalLetterValidation(String password) {
        return !password.equals(password.toLowerCase());
    }

    public static boolean digitsValidation(String password) {
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(ch>='0' && ch <= '9'){
                numCount++;
            }
        }
        return numCount >= 2;
    }

    public static boolean letterNumbersValidation(String password) {
        return password.matches("^[a-zA-Z0-9]+$");
    }
}
