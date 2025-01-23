import java.util.ArrayList;
import java.util.Scanner;

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company shiv = new Company("Shiv", 1999, 2);
        shiv.getCompanyDetails();
    }
}

class Company {
    private String name;
    private int estYear;
    private int numberOfDepartment;
    private final ArrayList<Department> departments;

    private final Scanner input;  // Fixed declaration to final and proper initialization

    Company(String name, int estYear, int numberOfDepartment) {
        this.name = name;
        this.estYear = estYear;
        this.numberOfDepartment = numberOfDepartment;
        this.input = new Scanner(System.in);
        this.departments = addAllDepartmentDetails();
    }

    private class Department {
        private String depName;
        private int numberOfEmployees;
        private final ArrayList<Employee> employees;

        Department(String depName, int numberOfEmployees) {
            this.depName = depName;
            this.numberOfEmployees = numberOfEmployees;
            this.employees = addAllEmployees();
        }

        private class Employee {
            private String empName;
            private int empAge;

            Employee(String name, int age) {
                this.empName = name;
                this.empAge = age;
            }

            public void showEmployeeDetails() {
                System.out.println("Employee created: Name = " + empName + ", Age = " + empAge);
            }
        }

        private ArrayList<Employee> addAllEmployees() {
            ArrayList<Employee> tempEmployees = new ArrayList<>();
            for (int i = 0; i < numberOfEmployees; i++) {
                System.out.println("Enter the details of employee " + (i + 1) + " (name age): ");
                String empName = input.next();
                int empAge = input.nextInt();

                Employee employee = new Employee(empName, empAge);
                tempEmployees.add(employee);
                employee.showEmployeeDetails();
            }
            return tempEmployees;
        }

        public void showAllEmployees() {
            for (Employee employee : employees) {
                System.out.println("Employee name: " + employee.empName + ", Age: " + employee.empAge);
            }
        }
    }

    private ArrayList<Department> addAllDepartmentDetails() {
        ArrayList<Department> tempDepartments = new ArrayList<>();
        for (int i = 0; i < numberOfDepartment; i++) {
            System.out.println("Enter the details for department " + (i + 1) + " (name number_of_employees): ");
            String depName = input.next();
            int numberOfEmployees = input.nextInt();

            Department department = new Department(depName, numberOfEmployees);
            tempDepartments.add(department);
        }
        return tempDepartments;
    }

    private void getAllDepartmentDetails() {
        for (Department department : departments) {
            System.out.println("Department: " + department.depName + ", Number of Employees: " + department.numberOfEmployees);
            department.showAllEmployees();
            System.out.println("----------------------------------");
        }
    }

    public void getCompanyDetails() {
        System.out.println("Company Name: " + name + ", Established Year: " + estYear);
        getAllDepartmentDetails();
        input.close();  // Close the input after using it to avoid resource leaks
    }
}
