package methods.variables;

public class WatermelonShop {
    public static void main(String[] args) {
        // second decimal
        System.out.println("Your discount is " + (Math.round(discountChecker(5) * 100.0) / 100.0));
        System.out.println("Your discount is " +  (Math.round(discountChecker(15) * 100.0) / 100.0));
        System.out.println("Your discount is " +  (Math.round(discountChecker(25) * 100.0) / 100.0));
        System.out.println("Your discount is " +  (Math.round(discountChecker(55) * 100.0) / 100.0));
    }

    public static double discountChecker(int watermelonCount) {
        double watermelonPrice = 13.45;
        double discountPercents = 0.1;
        double discount = 0;
        if(watermelonCount * watermelonPrice >= 140) {
            discount += (watermelonPrice * watermelonCount) * discountPercents;
        }

        return discount;

    }

}
