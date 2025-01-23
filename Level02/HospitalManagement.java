import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a patient for consultation
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
    }

    // Get list of patients the doctor has consulted
    public List<Patient> getPatients() {
        return patients;
    }
}

// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Alice");
        Doctor doctor2 = new Doctor("Bob");

        // Create patients
        Patient patient1 = new Patient("John");
        Patient patient2 = new Patient("Emma");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1); // Dr. Alice consults with John
        doctor1.consult(patient2); // Dr. Alice consults with Emma
        doctor2.consult(patient1); // Dr. Bob consults with John

        // Display consultations
        System.out.println("\nConsultations for Dr. " + doctor1.getName() + ":");
        for (Patient patient : doctor1.getPatients()) {
            System.out.println("- " + patient.getName());
        }

        System.out.println("\nConsultations for Dr. " + doctor2.getName() + ":");
        for (Patient patient : doctor2.getPatients()) {
            System.out.println("- " + patient.getName());
        }
    }
}
