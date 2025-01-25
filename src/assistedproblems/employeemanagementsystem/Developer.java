package assistedproblems.employeemanagementsystem;

public class Developer extends Employee{
    private String programmingLanguage;

    // Constructor
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}
