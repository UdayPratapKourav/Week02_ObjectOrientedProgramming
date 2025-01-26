package employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
    private String department;
    private double bonus;

    public FullTimeEmployee(String employeeId, String name  ,double baseSalary,double bonus){
        super(employeeId,name,baseSalary);

        this.bonus=bonus;

    }
    public double calculateSalary(){
        return  getBaseSalary()+bonus;
    }
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    public String getDepartmentDetails(){
        return "Department : "+department;
    }

}
