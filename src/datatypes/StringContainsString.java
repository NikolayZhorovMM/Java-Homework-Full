package datatypes;

public class StringContainsString {
    public static void main(String[] args) {
        String string1 = "I really like playing basketball!";
        String string2 = "basketball";
        String string3 = "basketballs";

        System.out.println("Is /" + string2 + "/ present in the -> "+ string1+ " = " + checkStrings(string1, string2));
        System.out.println("Is /" + string3 + "/ present in the -> "+ string1+ " = " + checkStrings(string1, string3));
    }

    public static boolean checkStrings(String string1, String string2 ) {
        return  string1.contains(string2);
    }
}
