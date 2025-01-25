package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Teacher extends Person{
    // attributes
    private String subject;

    //Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nTeacher' Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Teacher \nTeach "+subject+" subject");
    }


}
