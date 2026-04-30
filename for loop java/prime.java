
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner s1Scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s1Scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }
}
