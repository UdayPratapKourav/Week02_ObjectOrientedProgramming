package hospitalpatientmanagement;

public class Hospital {
    public void displayBill(Patient patient) {
        System.out.println( patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());
    }
}
