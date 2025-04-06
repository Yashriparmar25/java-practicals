
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int a = scanner.nextInt();
        double[] nums = new double[a];
        System.out.println("Enter elements:");
        for (int i = 0; i < a; i++) {
            nums[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + nums[i];
        }
        double average = sum / a;
        System.out.println("Average of the numbers is " + average);
        scanner.close();
    }
}


