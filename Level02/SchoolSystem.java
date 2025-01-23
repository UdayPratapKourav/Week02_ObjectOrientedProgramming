import java.util.ArrayList;
import java.util.List;

// Course class (Association with Student)
class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// Student class (Association with Course)
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Bidirectional association
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// School class (Aggregation with Student)
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Green Valley High");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display school and student details
        System.out.println("School: " + school.getName());
        System.out.println("Students:");
        for (Student student : school.getStudents()) {
            System.out.println("- " + student.getName() + " is enrolled in:");
            for (Course course : student.getCourses()) {
                System.out.println("  * " + course.getName());
            }
        }

        // Display course details
        System.out.println("\nCourses and enrolled students:");
        for (Course course : List.of(course1, course2)) {
            System.out.println("- " + course.getName() + " has the following students:");
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("  * " + student.getName());
            }
        }
    }
}
