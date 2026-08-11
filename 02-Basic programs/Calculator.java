import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A : ");
        int A = sc.nextInt();
        System.out.println("Enter the Value of B : ");
        int B = sc.nextInt();
        System.out.println("Enetr the Operator : ");
        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
