package datatypes;

public class LetterToRemove {
    public static void main(String[] args) {

      String sequence = "test";
      String letterToRemove = "t";

      System.out.println("Original string is -> "+sequence);
      System.out.println("Letter to remove -> " + letterToRemove);
      System.out.println("Second string -> "+ removeLetter(sequence,letterToRemove ));
    }

    public static String removeLetter(String sequence, String letterToRemove) {
        sequence = sequence.replace(letterToRemove, "");
        return sequence;
    }
}
