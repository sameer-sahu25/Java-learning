
import java.util.Scanner;

public class variable {

    public static void main(String args[]) {
        int n, min, max, sum = 0;
        float avg;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = s1.nextInt();

        int x[] = new int[n];
        System.out.println("Enter " + n + " value in array");
        for (int i = 0; i < n; i++) {
            x[i] = s1.nextInt();
        }

        min = max = x[0];
        for (int i = 0; i < n; i++) {
            sum = sum + x[i];
            if (min > x[i]) {
                min = x[i];
            }
            if (max < x[i]) {
                max = x[i];
            }
        }

        avg = (float) sum / n;
        System.out.println("maximum value=" + max);
        System.out.println("minimum value=" + min);
        System.out.println("average value=" + avg);
        s1.close();
    }
}
