package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Staff extends Person{
    // attribute
    private String designation;

    //    Constructor
    public Staff(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nStaff's Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Staff \nDesignation : "+designation);
    }
}
