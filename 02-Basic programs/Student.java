import java.util.*;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String ReportCard = marks >= 35 ? "Pass" : "Fail";
        System.out.println(ReportCard);
    }

}
