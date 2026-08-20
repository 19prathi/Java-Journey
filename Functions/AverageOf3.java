package Functions;

public class AverageOf3 {

    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double average = computeAverage(10, 20, 30);
        System.out.println("Average: " + average);
    }
}
