public class nine {
    public static void main(String[] args) {
        // Create Person object using new operator
        Person person = new Person("John Doe", 30, 50000.0);
        
        // Display instance variables
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Salary: " + person.salary);
    }
}

class Person {
    // Instance variables
    String name;
    int age;
    double salary;
    
    // Constructor
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
