package employeemanagementsystem;

public abstract class Employee {
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

        private String employeeId;
        private String name;
        private double baseSalary;

        public Employee(String employeeId, String name  ,double baseSalary){
            this.employeeId=employeeId;
            this.name=name;
            this.baseSalary=baseSalary;

        }

        public abstract double calculateSalary();
        public void displayDetails(){
            System.out.println("Employee id is :"+employeeId);
            System.out.println("Employee name is :"+name);
            System.out.println("Employee base salary is :"+baseSalary);
            System.out.println("Calculated salary is :"+calculateSalary());
        }

}
