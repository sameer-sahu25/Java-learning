
/*wap to input an positive integer value and display maximum and minimum digit values without using array using loop and if statemt*/
import java.util.Scanner;

public class MaxDigit {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s1.nextInt();
        System.out.println("Positive integer: " + n);

        int maxDigit = 0;
        int minDigit = 9;
        int temp = n;
        int digit;

        while (temp > 0) {
            digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            if (digit < minDigit) {
                minDigit = digit;
            }
            temp /= 10;
        }

        System.out.println("Maximum digit: " + maxDigit);
        System.out.println("Minimum digit: " + minDigit);
    }
}
