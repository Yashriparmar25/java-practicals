import java.util.Arrays;
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of strings to sort: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            String[] strings = new String[n];
            
            System.out.println("Enter the strings:");
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.nextLine();
            }
            
            Arrays.sort(strings);
            
            System.out.println("\nSorted strings:");
            for (String str : strings) {
                System.out.println(str);
            }
        }
    }
}
