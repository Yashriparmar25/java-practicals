import java.util.Scanner;

public class three {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get three numbers from user
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        // Solution using ternary operator
        int greatestTernary = (num1 > num2) ? 
                            ((num1 > num3) ? num1 : num3) : 
                            ((num2 > num3) ? num2 : num3);
        System.out.println("Using ternary operator, greatest number is: " + greatestTernary);
        
        // Solution using nested if
        int greatestNestedIf;
        if (num1 > num2) {
            if (num1 > num3) {
                greatestNestedIf = num1;
            } else {
                greatestNestedIf = num3;
            }
        } else {
            if (num2 > num3) {
                greatestNestedIf = num2;
            } else {
                greatestNestedIf = num3;
            }
        }
        System.out.println("Using nested if, greatest number is: " + greatestNestedIf);
        
        scanner.close();
    }
}   
