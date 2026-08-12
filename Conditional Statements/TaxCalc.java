import java.util.*;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income > 100000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }
        System.out.println("Your Tax is =" + tax);
    }
}
