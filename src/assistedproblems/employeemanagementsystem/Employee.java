package assistedproblems.employeemanagementsystem;

public class Employee {
    private String name;
    private String id;
    private double salary;

    // Constructor
    Employee(String name, String id, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

}
