package assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails() to include team size
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

}
