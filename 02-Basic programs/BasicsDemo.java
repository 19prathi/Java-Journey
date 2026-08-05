public class BasicsDemo {
    public static void main(String[] args) {

        // Variables and Data Types
        int age = 19;
        double height = 5.8;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Prathik";

        System.out.println("=== Variables and Data Types ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        // Type Conversion (Widening - Automatic)
        int num = 100;
        double convertedNum = num;

        System.out.println("\n=== Type Conversion ===");
        System.out.println("Integer: " + num);
        System.out.println("Converted to Double: " + convertedNum);

        // Type Casting (Narrowing - Manual)
        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println("\n=== Type Casting ===");
        System.out.println("Double: " + price);
        System.out.println("Casted to Integer: " + wholePrice);

        // Type Promotion
        byte a = 10;
        byte b = 20;
        int result = a + b;   // byte + byte becomes int

        char ch = 'A';
        int ascii = ch;       // char promoted to int

        System.out.println("\n=== Type Promotion ===");
        System.out.println("a + b = " + result);
        System.out.println("ASCII value of " + ch + " = " + ascii);

        // Mixed Data Type Promotion
        int x = 10;
        float y = 5.5f;
        double z = x + y;

        System.out.println("Mixed Promotion Result: " + z);
    }
}