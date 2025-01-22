class Employee{
    private static String companyName="Cg";
    private String name;
    private String designation;
    private final int id;
    private static int totalEmployee;

    Employee(String name,String designation,int id){
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployee++;

    }
    public static void updateCompanyName(String companyName){
        Employee.companyName=companyName;

    }
    public  void displayEmployeeDetails(){
        if(this instanceof Employee){
            System.out.println("Company name is : "+ companyName);
            System.out.println("Employee Name is : "+name);
            System.out.println("Employee designation is : "+designation);

        }else{
            System.out.println("This object is not a Employee");
        }

    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employee :"+totalEmployee);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee("Alice", "Manager", 101);
        Employee emp2 = new Employee("Bob", "Developer", 102);

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees
        Employee.displayTotalEmployees();

        // Update and display new company name
        Employee.updateCompanyName("TechCorp");
        emp1.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }


}
