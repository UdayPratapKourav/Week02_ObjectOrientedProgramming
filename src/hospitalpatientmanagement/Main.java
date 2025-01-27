package hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        InPatient inPatient = new InPatient("P001", "John Doe", 45, 2000.0, 3);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, 500.0);

        // Add medical records
        inPatient.addRecord("Diagnosed with pneumonia");
        inPatient.addRecord("Admitted on 20th Jan 2025");
        outPatient.addRecord("Consulted for a fever");
        outPatient.addRecord("Prescribed medication");

        inPatient.getPatientDetails();
        System.out.println(inPatient.viewRecord());

        Hospital hospital = new Hospital();


        System.out.println("=== InPatient Details ===");
        hospital.displayBill(inPatient);
        System.out.println("Medical Records: " + inPatient.viewRecord());

        System.out.println("\n=== OutPatient Details ===");
        hospital.displayBill(outPatient);
        System.out.println("Medical Records: " + outPatient.viewRecord());
    }
}
