class Student{
    private static String universityName;
    private String name ;
    private final int rollNumber;
    private String grade;
    private static int totalStudent;

    Student(String name, int rollNumber,String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudent++;

    }
    //Method for updating the university name
    public static void updateUniversityName(String universityName){
        Student.universityName=universityName;
    }
    //Method for updating grade
    public void updateGrade(String grade){
        if(this instanceof Student){
            this.grade=grade;
            System.out.println("Grade is updated of the Rollnumber :"+rollNumber);
        }else{
            System.out.println("Not a object of Student :");
        }

    }

    //Displaying the details of student
    public void displayDetails(){
        if(this instanceof Student){
            System.out.println("Student name is : "+name);
            System.out.println("Student rollNumber is : "+rollNumber);
            System.out.println("Student Grade is : "+grade);
            System.out.println("Student's university name is : "+universityName);
        }
    }
    //Method for displaying total number of student
    public static void displayTotalStudents(){
        System.out.println("Total students are :"+totalStudent);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student.updateUniversityName("RGPV");
       Student uday= new Student("uday",123,"A");
       Student.displayTotalStudents();
       uday.displayDetails();
       uday.updateGrade("B");
       uday.displayDetails();
       Student raj = new Student("Raj",1234,"B");
       Student.displayTotalStudents();
       raj.displayDetails();


    }
}
