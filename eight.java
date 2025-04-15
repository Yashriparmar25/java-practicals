import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        // Create StringBuffer with default string
        StringBuffer buffer = new StringBuffer("Hello World");
        System.out.println("Original string: " + buffer);
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get input from user
            System.out.print("Enter string to append: ");
            String appendStr = scanner.nextLine();
            
            System.out.print("Enter position to insert at: ");
            int position = scanner.nextInt();
            
            // Insert at specified position
            buffer.insert(position, appendStr);
            System.out.println("Modified string: " + buffer);
            
            // Display reverse
            System.out.println("Reversed string: " + buffer.reverse());
        } finally {
            scanner.close();
        }
    }
}
