public class Reverse_Number {
    public static void main(String[] args) {
        int n = 191006;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n /= 10;
        }
    }
}
