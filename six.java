import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();
        
        System.out.println("Enter the substring to replace:");
        String oldSubstring = scanner.nextLine();
        
        System.out.println("Enter the new substring:");
        String newSubstring = scanner.nextLine();
        
        String modifiedString = originalString.replace(oldSubstring, newSubstring);
        
        System.out.println("Modified string:");
        System.out.println(modifiedString);
        
        scanner.close();
    }
}

