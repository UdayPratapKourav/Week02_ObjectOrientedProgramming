package multilevelinheritance.EducationalCourseHierarchy;
public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;
    public PaidOnlineCourse(String courseName,String duration,String platform,boolean isRecorded,double fee,double discount ){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;



    }
    public void  displayDetails(){
        super.displayDetails();
        System.out.println("Course fee is :"+fee);
        System.out.println("Discount is :"+discount);
    }
}
