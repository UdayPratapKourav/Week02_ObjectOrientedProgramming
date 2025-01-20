// Base class Student
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {  // Validating CGPA range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected member usage
class PostgraduateStudent extends Student {
    private String thesisTitle;  // Additional attribute for postgraduate students

    // Constructor for postgraduate student
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);  // Calling the superclass constructor
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayDetails();  // Accessing superclass method
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

// Main class to test the implementation
public class UniversityManagement {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 8.5);
        student.displayDetails();
        student.setCGPA(9.2);  // Update CGPA using setter
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(202, "Bob", 9.1, "AI Research");
        pgStudent.displayPostgraduateDetails();
    }
}
