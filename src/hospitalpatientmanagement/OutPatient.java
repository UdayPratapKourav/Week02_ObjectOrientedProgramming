package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private List<String> medicalHistory = new ArrayList<>();
    OutPatient(String patientId,String name,int age,double consultationFee){
        super(patientId,name,age);
        this.consultationFee=consultationFee;


    }

    public double calculateBill() {
        return consultationFee + 100.0;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecord() {
        return medicalHistory;
    }


}
