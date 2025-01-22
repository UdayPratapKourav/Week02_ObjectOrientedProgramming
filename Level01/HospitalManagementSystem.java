class Patient {
    private static String hospitalName = "City Hospital";  // Static variable shared by all patients
    private static int totalPatients = 0;  // Static counter for total patients
    private String name;
    private int age;
    private String ailment;
    private final int patientID;  // Final variable for unique patient ID

    // Constructor using 'this' to initialize fields
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Static method to update hospital name
    public static void updateHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }

    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("This object is not a Patient.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Update hospital name
        Patient.updateHospitalName("General Health Care");

        // Create patient objects
        Patient patient1 = new Patient("John Doe", 30, "Flu", 101);
        Patient patient2 = new Patient("Jane Smith", 45, "Diabetes", 102);

        // Display patient details
        patient1.displayDetails();
        patient2.displayDetails();

        // Display total patients
        Patient.getTotalPatients();
    }
}
