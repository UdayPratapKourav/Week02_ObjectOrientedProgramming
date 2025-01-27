package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int numberOfDays;
    private List<String> medicalHistory = new ArrayList<>();

    InPatient(String patientId, String name, int age, double roomCharge, int numberOfDays) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;


    }

    @Override
    public double calculateBill() {
        return roomCharge * numberOfDays + 100.0;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecord() {
        return medicalHistory;
    }
}
