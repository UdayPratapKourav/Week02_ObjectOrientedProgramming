package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Main {
    public static void main(String[] args) {
        // create objects for all subclasses
        Teacher teacher = new Teacher("Yogesh",51,"Physics");
        Student student = new Student("Ankit", 15, "B+");
        Staff staff = new Staff("Ramesh",42,"Driver");

        //call of displayRole()
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();

    }

}
