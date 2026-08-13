import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many integers: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers = " + evenSum);
        System.out.println("Sum of odd integers = " + oddSum);

    }
}