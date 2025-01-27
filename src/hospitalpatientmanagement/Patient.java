package hospitalpatientmanagement;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;

    }



    public abstract double calculateBill();

    public String getPatientDetails(){

        return "Patient id is : "+patientId+ "Patient name is :"+patientId+ "Patient age is :"+age;
    }
}
