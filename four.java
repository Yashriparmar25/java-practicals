
    import java.util.Scanner;

    public class four {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Fibonacci Series Program");
            System.out.println("1. Print first n terms");
            System.out.println("2. Print terms up to a maximum number");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter number of terms: ");
                int n = scanner.nextInt();
                printNTerms(n);
            } else if (choice == 2) {
                System.out.print("Enter maximum number: ");
                int max = scanner.nextInt();
                printUpToMax(max);
            } else {
                System.out.println("Invalid choice");
            }
            
            scanner.close();
        }
        
        // Method to print first n terms of Fibonacci series
        private static void printNTerms(int n) {
            int a = 0, b = 1;
            System.out.print("First " + n + " terms: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
        }
        
        // Method to print Fibonacci series up to a maximum number
        private static void printUpToMax(int max) {
            int a = 0, b = 1;
            System.out.print("Series up to " + max + ": " + a + " " + b + " ");
            
            while (true) {
                int sum = a + b;
                if (sum > max) break;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        }
    }   

