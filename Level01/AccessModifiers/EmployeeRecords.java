
class Employee{
  public int employeeID;
  protected String  department;
  private double salary;
//constructor
  Employee(int employeeID, String department, double salary){
      this.employeeID=employeeID;
      this.department=department;
      this.salary=salary;

  }

    public double getSalary() {
        return salary;
    }

  //Method for modifying the salary
   public void modifySalary( double salary){
      if(salary>0){
          this.salary=salary;
          System.out.println("Salary modified by :"+salary);
      }else{
          System.out.println("Invalid salary");
      }
  }

}


class Manager extends Employee{
    public Manager(int employeeID, String department, double salary){
        super(employeeID,department,salary);
    }

    public void displayDetails(){
        System.out.println("employeeId is : "+employeeID);
        System.out.println("department is : "+department);
        System.out.println("salary is : " + getSalary());

    }

}

public class EmployeeRecords {
    public static void main(String[] args) {
     Manager ud = new Manager(201,"IT",20235.0);
     ud.displayDetails();
     ud.modifySalary(25130.0);
        System.out.println("Updated salary is : "+ ud.getSalary());

    }
}
