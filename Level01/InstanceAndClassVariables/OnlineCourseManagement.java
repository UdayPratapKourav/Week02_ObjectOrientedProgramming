class Course{
    private String courseName;//instance variable
    private int duration;//instance variable
    private double fee;//instance variable
    private static String instituteName;//class variable
    //constructor
    Course(String courseName, int duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;

    }
    //instance method
    public void displayCourseDetails(){
        System.out.println("Course name is :"+courseName);
        System.out.println("Course duration is :"+duration);
        System.out.println("Course fee is :"+fee);
        System.out.println("Institute name is "+instituteName);

    }
    //class or static method
    public static void updateInstituteName(String instituteName){
       Course.instituteName=instituteName;

    }
}
public class OnlineCourseManagement {

    public static void main(String[] args) {
      Course st1=new Course("Btech",4,78000.0);
      Course.updateInstituteName("LNCT");
        st1.displayCourseDetails();
      Course st2=new Course("bse",4,88000.0);
        st2.displayCourseDetails();
        Course.updateInstituteName("TIT");
      Course st3=new Course("Btech",4,98000.0);
        st3.displayCourseDetails();



    }
}
