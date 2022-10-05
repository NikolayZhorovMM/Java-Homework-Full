package datatypes;

public class ReturnCharAtIndex {
    public static void main(String[] args) {

        getChar("Hello World", 0 );
        getChar("Hello World", 1 );
        getChar("Hello World", 2 );
        getChar("Hello World", 3 );
    }

    public  static void getChar(String sequence, int index) {
        if(index < 0 || index >= sequence.length()){
            System.out.println("Index is out of sequence scope");
        }
        System.out.println("Original string is = " + sequence);
        System.out.println("The character at position " + index + " is "+ sequence.charAt(index));
    }
}
