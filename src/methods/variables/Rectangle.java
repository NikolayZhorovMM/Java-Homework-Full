package methods.variables;

public class Rectangle {
    public  static  void  main(String[] args) {
        boolean isRectangle;

        checkRectangleOrSquare(5,5);
        checkRectangleOrSquare(6,5);
        checkRectangleOrSquare(9,9);
    }

    public static void checkRectangleOrSquare(int length, int width) {
       if(length == width) {
           System.out.println("Square -> "+length+":"+width);
       }
       else {
           System.out.println("Rectangle -> "+length+":"+width);
       }
    }
}
