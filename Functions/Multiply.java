package Functions;

public class Multiply {
    public static int multiply (int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        int Prod = multiply(a ,b);
        System.out.println("a*b = " + Prod);
    }
}
