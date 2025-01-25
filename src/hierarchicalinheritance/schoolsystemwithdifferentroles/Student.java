package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Student  extends Person{
    // attribute
    private String grade;

    // constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nStudent's Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Student \nGrade : "+grade);
    }
}

