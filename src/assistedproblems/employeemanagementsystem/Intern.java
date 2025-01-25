package assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
    private int internshipDuration; // Duration in months

    // Constructor
    public Intern(String name, String id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    // Overriding displayDetails() to include internship duration
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }

}
