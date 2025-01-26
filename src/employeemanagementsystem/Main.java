package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("A1","Uday",350000.0,20000.0);
        fullTimeEmployee.assignDepartment("Engineering");

        // Create PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("A2", "Bob", 20000.0, 20, 500);
        partTimeEmployee.assignDepartment("Support");

        // Add employees to the list
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Process and display details of employees using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
