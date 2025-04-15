public class ten {
    public static void main(String[] args) {
        // Create 3 employee objects
        Employee emp1 = new Employee("E001", "John Doe", "Manager", 50000);
        Employee emp2 = new Employee("E002", "Jane Smith", "Developer", 40000);
        Employee emp3 = new Employee("E003", "Bob Johnson", "Tester", 35000);

        // Calculate and print details for each employee
        emp1.calculateAndPrintPay();
        emp2.calculateAndPrintPay();
        emp3.calculateAndPrintPay();
    }
}

class Employee {
    String empCode;
    String name;
    String designation;
    double basicPay;

    // Constructor
    public Employee(String empCode, String name, String designation, double basicPay) {
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    // Method to calculate and print pay details
    public void calculateAndPrintPay() {
        double hra = basicPay * 0.10;
        double da = basicPay * 0.45;
        double totalPay = basicPay + hra + da;

        System.out.println("\nEmployee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA (10%): " + hra);
        System.out.println("DA (45%): " + da);
        System.out.println("Total Pay: " + totalPay);
    }
}
