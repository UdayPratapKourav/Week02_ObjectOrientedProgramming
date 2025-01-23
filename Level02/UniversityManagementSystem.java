import java.util.ArrayList;
import java.util.List;

// Course0 class
class Course0 {
    private String courseName;
    private Professor0 professor;
    private List<Student0> students;

    public Course0(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor0 professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student0 student) {
        students.add(student);
    }

    public Professor0 getProfessor() {
        return professor;
    }

    public List<Student0> getStudents() {
        return students;
    }
}

// Professor0 class
class Professor0 {
    private String name;

    public Professor0(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Student0 class
class Student0 {
    private String name;
    private List<Course0> courses;

    public Student0(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course0 course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public List<Course0> getCourses() {
        return courses;
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor0 prof1 = new Professor0("Dr. Smith");
        Professor0 prof2 = new Professor0("Dr. Johnson");

        // Create courses
        Course0 course1 = new Course0("Mathematics");
        Course0 course2 = new Course0("Physics");

        // Assign professors to courses
        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);

        // Create students
        Student0 student1 = new Student0("Alice");
        Student0 student2 = new Student0("Bob");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student1.enrollCourse(course2);

        // Display course and student details
        System.out.println("University Management System:");
        System.out.println();

        for (Course0 course : List.of(course1, course2)) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Professor: " + course.getProfessor().getName());
            System.out.println("Students Enrolled:");
            for (Student0 student : course.getStudents()) {
                System.out.println("- " + student.getName());
            }
            System.out.println();
        }

        // Display student details
        for (Student0 student : List.of(student1, student2)) {
            System.out.println("Student: " + student.getName());
            System.out.println("Courses Enrolled:");
            for (Course0 course : student.getCourses()) {
                System.out.println("- " + course.getCourseName());
            }
            System.out.println();
        }
    }
}
