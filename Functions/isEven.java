package Functions;

public class isEven {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 10;

        if (isEven(number)) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is not even");
        }
    }
}

