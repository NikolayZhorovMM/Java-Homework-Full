package methods.variables;

public class WatermelonShopExt {
    public static void main(String[] args) {
        // second decimal
        System.out.println("The final price is " + (Math.round(finalPriceGenerator(5, true) * 100.0) / 100.0));
        System.out.println("The final price is " +  (Math.round(finalPriceGenerator(15, true) * 100.0) / 100.0));
        System.out.println("The final price is " +  (Math.round(finalPriceGenerator(25, true) * 100.0) / 100.0));
        System.out.println("The final price is " +  (Math.round(finalPriceGenerator(55, true) * 100.0) / 100.0));
    }

    public static double finalPriceGenerator(int watermelonCount, boolean isRegularCustomer) {
        double watermelonPrice = 13.45;
        double discounPerVolume = 0.1;
        double discountRegularCustomer = 0.05;
        double finalDiscount = 0;
        double amountToPay = watermelonCount * watermelonPrice;
        if(amountToPay >= 140) {
            double currentDiscount = amountToPay * discounPerVolume;
            amountToPay -= currentDiscount;
        }

        if(isRegularCustomer){
            double currentDiscount = amountToPay * discountRegularCustomer;
            amountToPay -= currentDiscount;
        }

        return amountToPay;
    }

}

