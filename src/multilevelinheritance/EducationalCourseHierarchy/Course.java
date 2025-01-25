package multilevelinheritance.EducationalCourseHierarchy;
public class Course {
    private String courseName;
    private String duration;

    public Course(String courseName,String duration){
        this.duration=duration;
        this.courseName=courseName;

    }
    public void displayDetails(){
        System.out.println("Course name :"+courseName);
        System.out.println("Course duration :"+duration);

    }

}
