package datatypes;

public class ContainsDigits {
    public static void main(String[] args) {


      System.out.println("Have only digits -> " + checkAllDigits("12345678"));
      System.out.println("Have only digits -> " + checkAllDigits("12345678Z"));
    }

    public  static  boolean checkAllDigits(String sequence) {
        int numCount = 0;
        for (int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);

            if(ch>='0' && ch <= '9'){
                numCount++;
            }
        }
        return numCount == sequence.length();
    }
}
