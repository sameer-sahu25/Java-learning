
import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        int sub1, sub2, sub3, total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter marks of subject 2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter marks of subject 3: ");
        sub3 = sc.nextInt();
        total = sub1 + sub2 + sub3;
        System.out.println("Total: " + total);
        percentage = total / 3.0f;
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 60) {
            System.out.println("Division: First Division");
        } else if (percentage >= 45) {
            System.out.println("Division: Second Division");
        } else if (percentage >= 33) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Status: FAIL");
        }
    }
}
