import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation with University)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (Composition with University)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department (Composition)
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add a faculty member (Aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Get the list of departments
    public List<Department> getDepartments() {
        return departments;
    }

    // Get the list of faculties
    public List<Faculty> getFaculties() {
        return faculties;
    }

    public String getName() {
        return name;
    }

    // Delete the university (composed departments will also be deleted)
    public void deleteUniversity() {
        departments.clear(); // All departments are removed
        System.out.println("University and its departments have been deleted.");
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Add departments to the university
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Prof. Johnson");

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display university details
        System.out.println("University: " + university.getName());

        // Display departments
        System.out.println("Departments:");
        for (Department department : university.getDepartments()) {
            System.out.println("- " + department.getName());
        }

        // Display faculty members
        System.out.println("\nFaculties:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("- " + faculty.getName());
        }

        // Delete the university (composition example)
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Note: Faculty members still exist independently (aggregation example)
        System.out.println("\nFaculty members still exist:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("- " + faculty.getName());
        }
    }
}
