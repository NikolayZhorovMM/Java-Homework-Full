package methods.variables;

public class CompanyBonus {
    public static void main(String[] args) {

        System.out.println( bonusCalculator(1, 1000));
        System.out.println( bonusCalculator(3, 1543));
        System.out.println( bonusCalculator(5, 1245.56));
        System.out.println( bonusCalculator(10, 33333));
    }

    public static double bonusCalculator(int yearsOfService, double paycheck) {
        double bonus;
        if(yearsOfService < 3) {
           bonus =  0;
        }
        else if(yearsOfService >= 3 && yearsOfService < 5) {
            bonus = paycheck * 0.07;
        }
        else if(yearsOfService >=5 && yearsOfService < 10) {
            bonus = paycheck * 0.14;
        } else {
            bonus = paycheck * 0.25;
        }
        return  bonus;
    }
}
