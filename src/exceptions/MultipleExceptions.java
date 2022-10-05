package exceptions;

public class MultipleExceptions {
    public static void main(String[] args) {
        multipleExceptions();
    }

    public static void multipleExceptions(){
        try {
            int a[] = new int[0];
            a[5]   = 30/5;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
