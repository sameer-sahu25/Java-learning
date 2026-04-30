
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sub1, sub2, sub3;

        try {
            // Input marks for 3 subjects
            System.out.print("Enter marks for Subject 1 (0-100): ");
            sub1 = sc.nextDouble();
            System.out.print("Enter marks for Subject 2 (0-100): ");
            sub2 = sc.nextDouble();
            System.out.print("Enter marks for Subject 3 (0-100): ");
            sub3 = sc.nextDouble();

            // Validate marks
            if (!isValidMarks(sub1) || !isValidMarks(sub2) || !isValidMarks(sub3)) {
                System.out.println("Invalid marks entered! Marks must be between 0 and 100.");
                return;
            }

            // Check pass/fail
            boolean isPass = (sub1 >= 33 && sub2 >= 33 && sub3 >= 33);

            // Calculate total and percentage
            double total = sub1 + sub2 + sub3;
            double percentage = total / 3.0;

            // Display results
            System.out.println("\n--- Student Result ---");
            System.out.println("Total Marks: " + total);
            System.out.printf("Percentage: %.2f%%\n", percentage);

            if (isPass) {
                System.out.println("Status: PASS");
                System.out.println("Division: " + getDivision(percentage));
            } else {
                System.out.println("Status: FAIL");
                System.out.println("Division: No division (Failed)");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }

    // Method to validate marks
    private static boolean isValidMarks(double marks) {
        return marks >= 0 && marks <= 100;
    }

    // Method to determine division
    private static String getDivision(double percentage) {
        if (percentage >= 60) {
            return "First Division";
        } else if (percentage >= 45) {
            return "Second Division";
        } else if (percentage >= 33) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}
