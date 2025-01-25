package multilevelinheritance.EducationalCourseHierarchy;
public class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName,String duration,String platform,boolean isRecorded ){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;


    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course platform is :"+platform);
        System.out.println("Is course recorded :"+isRecorded);
    }
}
