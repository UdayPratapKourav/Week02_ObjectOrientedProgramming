package assistedproblems.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create a Manager
        Manager manager = new Manager("Uday", "M001", 75000.0, 5);

        // Create a Developer
        Developer developer = new Developer("John", "D001", 60000.0, "Java");

        // Create an Intern
        Intern intern = new Intern("Jane", "I001", 20000.0, 6);

        // Display details for each employee
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();

    }
}