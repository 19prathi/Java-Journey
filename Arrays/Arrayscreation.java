package Arrays;
import java.util.*;
public class Arrayscreation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Java :" + marks[0]);
        System.out.println("DDCO :" + marks[1]);
        System.out.println("OS :" + marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : " + percentage);
    }
}